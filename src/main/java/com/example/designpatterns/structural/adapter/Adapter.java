package com.example.designpatterns.structural.adapter;

/*
어댑터 패턴(Adapter Pattern)이란?
어댑터 패턴은 기존 클래스의 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환하는 데 사용됩니다. 이를 통해 호환성이 없는 인터페이스를 가진 클래스를 클라이언트가 사용할 수 있도록 합니다.

어댑터 패턴을 사용하는 이유?
어댑터 패턴을 사용하면 서로 다른 인터페이스를 갖는 클래스를 함께 사용할 수 있습니다. 기존 클래스를 변경하지 않고도 새로운 인터페이스를 제공할 수 있습니다.

장점:
호환성 제공: 서로 다른 인터페이스를 가진 클래스를 함께 사용할 수 있도록 해줍니다.
기존 코드 재사용: 기존 클래스를 수정하지 않고도 새로운 인터페이스를 제공할 수 있습니다.
유연성 증가: 시스템의 유연성을 높이고, 클라이언트 코드의 변경을 최소화할 수 있습니다.
단점:
복잡성 증가: 어댑터 클래스가 추가되면서 코드의 복잡성이 증가할 수 있습니다.
성능 저하: 어댑터를 통해 호출할 때 성능이 약간 저하될 수 있습니다.
코드 예제:
 */

// 한국형 플러그 인터페이스
interface KoreanPlug {
  void connectKoreanPlug();
}

// 한국형 플러그 구현 클래스
class KoreanPlugImpl implements KoreanPlug {
  @Override
  public void connectKoreanPlug() {
    System.out.println("한국형 플러그를 연결합니다.");
  }
}

// 미국형 소켓 인터페이스
interface AmericanSocket {
  void connectAmericanSocket();
}

// 어댑터 클래스
class PlugAdapter implements AmericanSocket {
  private KoreanPlug koreanPlug;

  public PlugAdapter(KoreanPlug koreanPlug) {
    this.koreanPlug = koreanPlug;
  }

  @Override
  public void connectAmericanSocket() {
    System.out.println("어댑터를 통해 한국형 플러그를 미국형 소켓에 연결합니다.");
    koreanPlug.connectKoreanPlug();
  }
}

public class Adapter{
  public static void main(String[] args) {
    KoreanPlug koreanPlug = new KoreanPlugImpl();
    AmericanSocket americanSocket = new PlugAdapter(koreanPlug);

    americanSocket.connectAmericanSocket();  // 출력: 어댑터를 통해 한국형 플러그를 미국형 소켓에 연결합니다. 한국형 플러그를 연결합니다.
  }
}
