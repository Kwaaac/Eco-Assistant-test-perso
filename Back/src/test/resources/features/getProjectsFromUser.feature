Feature: getProjectsFromUser feature
#donnez les noms des champs de des entites spring ici on dit Id
    Scenario: A user get his projects
      Given the following userId 'id'
      When the user requests his projects
      Then all his projects are returned