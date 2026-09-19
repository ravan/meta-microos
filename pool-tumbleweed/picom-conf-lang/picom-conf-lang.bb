SUMMARY = "Translations for package picom-conf"
DESCRIPTION = "Provides translations for the 'picom-conf' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.0"

RPM_NAME = "picom-conf-lang-0.17.0-2.4.noarch.rpm"
RPM_HASH = "554499db6e2c3946e795bc5e9dd8c926af5b0554eb4b8d587624a2c22c347c59c5dc55796af44077f0e5569056d9977c5a7745ca780f92fc75eacb4fdc761405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picom-conf-lang \
picom-conf-lang-all"

RDEPENDS:${PN} += "picom-conf"

inherit rpm
