SUMMARY = "Font for the openSUSE Brand"
DESCRIPTION = "The Fifth Leg font is the font used for openSUSE branded material."
LICENSE = "OFL-1.1"

PV = "0.6"

RPM_NAME = "fifth-leg-font-0.6-25.25.noarch.rpm"
RPM_HASH = "b691b77e2b2d5ccfa71ecd70582696e43090e4c45ee13a3f6b4842833597856038096491ee1f10f1257b67ee0dc91fc1fe2a454b9c6f59d10c8adfef0bfcd0e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fifth-leg-font"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
