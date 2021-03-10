#Autor: Jofre
@stories
Feature: uTest
  As a user, I want to register to learn new skills

  @scenario1
  Scenario: Enter uTest
    Given than Jofre wants to register in uTest
    When he fills out the form
      | strNombre | strApellido | strCorreo                   | strMes | strDia | strYear | strCiudad | strCoPostal | strPais  | strSiOperativo | strVersion    | strLenguaje | strPassword  | strPassConfirm |
      | Jofre     | Rodriguez   | jofrealejandro77@gmail.com  | August |  31    | 1995    | Cúcuta    | 540004      | Colombia | Windows        | 10 64-bit     | Spanish     | 123456*Jofre | 123456*Jofre   |
    Then he is verified
      | strVerified   |
      | The last step |