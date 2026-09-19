SUMMARY = "Intelligent predictive text entry platform (tools and demos)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the tools required to generate custom statistical data used by the presage predictive text engine to generate predictions. \
 \
This package also contains simple demonstration programs and simulator."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "22365ef473903dba5cf476968aef2dfe43705d09453220aa14fa62d5f94c4935cd4b8d5af90f4519873e81a2cad606482e631b05b67aa97640f232e4c33f97c8"

RPROVIDES:${PN} += "presage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpresage.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
