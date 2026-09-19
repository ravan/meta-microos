SUMMARY = "Utility library of rapidyaml"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libc4core0_2_5-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "42360140f8323738721148aaf70a686f2d14cefc40ce176086741f1309908a51568af3baaf1012140bb9e40594e698532bf008a35d7697cf2f06e22d6a64e0c9"

RPROVIDES:${PN} += "libc4core.so.0.2.5 \
libc4core0-2-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
