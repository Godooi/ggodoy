#Author: gloureirog@indracompany.com
#encoding: iso-8859-1
@ProjetoBancoRipley
Feature: Registro de Tarjeta - Website Banco Ripley

Yo como Analista de pruebas
Quiero registrar una tarjeta
 

@CT001
Scenario:  Registro de tarjeta

Given CT01 - Acceder la Página principal
When CT01 - Clicar en la tarjeta
When CT01 - Prestamo Efectivo
When CT01 - Consolidacion de Deuda
When CT01 - Credito por convenio
When CT01 - Reprogramacion de Deuda
When CT01 - Prestamos R Cuotas
When CT01 - Pago Antecipado