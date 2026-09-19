SUMMARY = "Python bindings for Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the Python bindings of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "python3-openbabel-3.2.1-1.1.aarch64.rpm"
RPM_HASH = "74e2d614995d531e231acb864bf5939d0e68e4684f9208427ac53a265699db510cba90f09cc1144d30943aa10942c658ba88483529700879d581467873009d65"

RPROVIDES:${PN} += "python3-openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.8 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
