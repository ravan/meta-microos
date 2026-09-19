SUMMARY = "Translations for package mathgl"
DESCRIPTION = "Provides translations for the 'mathgl' package."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-lang-8.0.3-2.6.noarch.rpm"
RPM_HASH = "bbef6c89ddba47cd38d6c17392ba57c5076384a219ce91dfea18a305993be0f5788f936dbd17f471c5e79794ed297d024ae38841916235b842b845d7a999ba23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mathgl-es \
locale-mathgl-ru \
mathgl-lang \
mathgl-lang-all"

RDEPENDS:${PN} += "mathgl"

inherit rpm
