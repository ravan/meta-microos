SUMMARY = "Component library of Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the shared library of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "libopenbabel8-3.2.1-1.1.aarch64.rpm"
RPM_HASH = "13040b9b70c6d94388a790a7b0c0ec4d7e24bbc24d3fcdd9801c03b6f7205cf532b91fd2c3cf51e2eabd3225fc9c84782e4f98011ffaa8110903a2a012c5511a"

RPROVIDES:${PN} += "libopenbabel.so.8 \
libopenbabel8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libinchi.so.1 \
libm.so.6 \
libmaeparser.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
