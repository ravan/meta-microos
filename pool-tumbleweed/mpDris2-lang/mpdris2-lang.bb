SUMMARY = "Translations for package mpDris2"
DESCRIPTION = "Provides translations for the 'mpDris2' package."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-lang-0.9.1-3.12.noarch.rpm"
RPM_HASH = "c1bba971727df698cdc0473beb813be54c50a2d5576121e837dc139bbd8e5941cf1c307669704cebca23f6ad6a20d46ba3d51fc95da66b61f1776bc2e7a9e424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mpDris2-fr \
locale-mpDris2-nl \
mpDris2-lang \
mpDris2-lang-all"

RDEPENDS:${PN} += "mpDris2"

inherit rpm
