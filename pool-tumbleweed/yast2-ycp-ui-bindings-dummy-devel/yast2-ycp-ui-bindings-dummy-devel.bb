SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine (dummy implementation)"
DESCRIPTION = "Development package for the dummy YCP UI bindings."
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-ycp-ui-bindings-dummy-devel-5.0.0-1.4.aarch64.rpm"
RPM_HASH = "00d996abb293b6050b09ca1b42e1fc0cb6b9521180956aa0ad33c8ca06194769707db52e00c8f4d3e97d8836be79ada147383aeea0a5c40cd811202292b73ba1"

RPROVIDES:${PN} += "pkgconfig-yast2-ycp-ui-bindings-dummy \
yast2-ycp-ui-bindings-dummy-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
yast2-core-devel \
yast2-devtools \
yast2-ycp-ui-bindings-dummy"

inherit rpm
