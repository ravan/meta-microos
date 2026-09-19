SUMMARY = "A chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the command-line utility, which is intended to \
be used as a replacement for the original babel program, to translate \
between various chemical file formats as well as a wide variety of \
utilities to foster development of other open source scientific \
software."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "openbabel-3.2.1-1.1.aarch64.rpm"
RPM_HASH = "0a4c3005e3078a331c6fb320b1b5c63b73e3ef6253c0ca64c6763f345fdf6ec5bf775c10f4e2b3c35500aadf1e412aac2ef2e0788e14b3d66b42ef7fb5b96b45"

RPROVIDES:${PN} += "openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.8 \
libstdc++.so.6"

inherit rpm
