package com.example.designpatterns.structural.facade;

/*
퍼사드 패턴(Facade Pattern)이란?
퍼사드 패턴은 복잡한 서브시스템에 대한 간단한 인터페이스를 제공하여, 클라이언트가 서브시스템을 쉽게 사용할 수 있게 하는 디자인 패턴입니다. 퍼사드는 서브시스템의 내부 구조를 숨기고, 필요한 기능만을 노출하여 클라이언트 코드의 복잡성을 줄여줍니다.

퍼사드 패턴을 사용하는 이유?
퍼사드 패턴을 사용하면 복잡한 서브시스템의 사용을 단순화할 수 있습니다. 클라이언트는 퍼사드 인터페이스를 통해 서브시스템을 쉽게 사용할 수 있으며, 서브시스템의 내부 구현에 의존하지 않게 됩니다.

장점:
서브시스템의 복잡성 감소: 클라이언트가 서브시스템의 내부 구조를 알 필요 없이 간단한 인터페이스를 통해 기능을 사용할 수 있습니다.
결합도 감소: 클라이언트와 서브시스템 간의 결합도를 낮출 수 있습니다.
유지보수성 향상: 서브시스템의 내부 구현을 변경하더라도 퍼사드 인터페이스만 유지하면 클라이언트 코드를 변경할 필요가 없습니다.
단점:
추가적인 추상화: 퍼사드 클래스가 추가되면서 클래스 계층이 복잡해질 수 있습니다.
서브시스템에 대한 완전한 노출 부족: 퍼사드가 모든 서브시스템 기능을 제공하지 않는 경우, 필요한 기능을 직접 접근해야 할 수 있습니다.
코드 예제:
 */

// 프로젝터 시스템
class Projector {
  public void on() {
    System.out.println("프로젝터 켜는 중");
  }

  public void off() {
    System.out.println("프로젝터 끄는 중");
  }
}

// 사운드 시스템
class SoundSystem {
  public void on() {
    System.out.println("사운드 시스템 켜는 중");
  }

  public void off() {
    System.out.println("사운드 시스템 끄는 중");
  }

  public void setVolume(int level) {
    System.out.println("볼륨을 " + level + "로 설정");
  }
}

// DVD 플레이어 시스템
class DVDPlayer {
  public void on() {
    System.out.println("DVD 플레이어 켜는 중");
  }

  public void off() {
    System.out.println("DVD 플레이어 끄는 중");
  }

  public void play(String movie) {
    System.out.println("영화 재생 중: " + movie);
  }
}

// 퍼사드 클래스
class HomeTheaterFacade {
  private Projector projector;
  private SoundSystem soundSystem;
  private DVDPlayer dvdPlayer;

  public HomeTheaterFacade() {
    this.projector = new Projector();
    this.soundSystem = new SoundSystem();
    this.dvdPlayer = new DVDPlayer();
  }

  public void watchMovie(String movie) {
    System.out.println("영화를 준비합니다.");
    projector.on();
    soundSystem.on();
    soundSystem.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
    System.out.println("영화가 재생됩니다.");
  }

  public void endMovie() {
    System.out.println("영화관 시스템을 종료합니다.");
    dvdPlayer.off();
    soundSystem.off();
    projector.off();
    System.out.println("영화관 시스템이 종료되었습니다.");
  }
}

public class Facade {
  public static void main(String[] args) {
    HomeTheaterFacade homeTheater = new HomeTheaterFacade();
    homeTheater.watchMovie("인셉션");  // 출력: 각 하위 시스템의 on 및 play 메서드 출력
    homeTheater.endMovie();            // 출력: 각 하위 시스템의 off 메서드 출력
  }
}
