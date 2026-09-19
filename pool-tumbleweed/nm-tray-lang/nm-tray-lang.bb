SUMMARY = "Translations for package nm-tray"
DESCRIPTION = "Provides translations for the 'nm-tray' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.1"

RPM_NAME = "nm-tray-lang-0.5.1-1.7.noarch.rpm"
RPM_HASH = "5da8b2a3a606e6f2836f427f143c7b6cd91e852f1cac0649823765d9b415f26f347239973d0fcd8b7191cca537a946023941e158afc66db531a1d3067493bf45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nm-tray-lang \
nm-tray-lang-all"

RDEPENDS:${PN} += "nm-tray"

inherit rpm
