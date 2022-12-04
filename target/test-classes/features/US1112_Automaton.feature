@demy
Feature: US1112  OTOMASTON TESTI

  Scenario: kullanici tekrar giris yapabilmeli

    Given Kullanici "myAutomationUrl" sayfasina gider
    Then  Kullanici Signup butonuna tiklar
    Then  Kullanici mail bolumune "mail" gonderir
    Then  Kullanici password bolumune "password" gonderir
    Then  Kullanici login Butonuna tiklar