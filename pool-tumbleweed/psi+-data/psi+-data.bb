SUMMARY = "Data for Psi+"
DESCRIPTION = "Icons, sounds, and themes for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-data-1.5.2112+0-1.6.noarch.rpm"
RPM_HASH = "b20239e49a2bec831a84e1f17cae3c11331d7fba4f6555e9b6e46bdbfdf605876c3874cfd8b32e6338874fbb7d957fb15f0f61ca72a3997256525014b27587a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-data \
psi+-icons \
psi+-sounds \
psi+-themes"

RDEPENDS:${PN} += ""

inherit rpm
