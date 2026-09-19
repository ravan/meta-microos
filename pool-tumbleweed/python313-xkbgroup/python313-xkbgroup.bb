SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-xkbgroup-0.2.0-4.5.noarch.rpm"
RPM_HASH = "49cc57f1104dae1996e9381e7f2cb9629bbbf1180c2f32ef9dad2ccfb94f351370ffe037c1e8ea660f529d78dfc348910413768a983357d292c5f335aa20f8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkbgroup \
python3.13dist-xkbgroup \
python313-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm
