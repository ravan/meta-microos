SUMMARY = "Common files for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "metatheme-adwaita-common-3.28-3.5.noarch.rpm"
RPM_HASH = "600864d569e1e91bbf52c4288b2ae6945da18845dd4d99eea75730ce25a754e52ad6c3cd096c217735c868b551eb1fb4ebf4607d5c5b0e4d9790f594a29e986f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-adwaita-common"

RDEPENDS:${PN} += ""

inherit rpm
