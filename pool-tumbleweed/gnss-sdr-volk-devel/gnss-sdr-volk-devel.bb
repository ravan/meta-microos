SUMMARY = "Development files for gnss-sdr-volk"
DESCRIPTION = "Development files for gnss-sdr-volk."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause & Zlib"

PV = "0.0.21"

RPM_NAME = "gnss-sdr-volk-devel-0.0.21-1.1.aarch64.rpm"
RPM_HASH = "6a016c92d8b6adf90891bf7721dd33f90175940ac24866e002744098348b7e503ccbec81ffd3f28972b179904b444ab7b397805960aeb957b8f00e99c10f29c3"

RPROVIDES:${PN} += "cmake-VolkGnsssdr \
gnss-sdr-volk-devel \
pkgconfig-volk-gnsssdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk-gnsssdr.so.0.0.21 \
libvolk-gnsssdr0-0-21 \
python-abi"

inherit rpm
