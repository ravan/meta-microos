SUMMARY = "Usage and stats for processor, memory, disks, network and processes"
DESCRIPTION = "Resource monitor that shows usage and stats for processor, memory, disks, \
network and processes. C++ version and continuation of bashtop and bpytop."
LICENSE = "Apache-2.0"

PV = "1.4.7+git20260501.6e39144"

RPM_NAME = "btop-1.4.7+git20260501.6e39144-1.2.aarch64.rpm"
RPM_HASH = "f127a425c8684f0f249d1ce7359df93dd01506a4774f1a2134b8f579cec87bb26c558349043494833b2d3ad5d636b5cf2bd058e0247fa82c7e493088545a8053"

RPROVIDES:${PN} += "btop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
