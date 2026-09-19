SUMMARY = "oneAPI Unified Runtime (UR)"
DESCRIPTION = "oneAPI Unified Runtime (UR) provides a unified interface to device \
agnostic runtimes such as DPC++. \
UR provides extensibility where new backends can be developed to \
support new software platforms and devices."
LICENSE = "Apache-2.0"

PV = "0.11.10"

RPM_NAME = "unified-runtime-0.11.10-2.1.aarch64.rpm"
RPM_HASH = "f4d66b2379333258a1c8a672e1f61cb1ef8c895475fe9591ec575ee6dd64e5665cd8c214beda039ec0e9705b85afb3175dd38219aadc1502e26de8e41dbafd31"

RPROVIDES:${PN} += "unified-runtime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libur-loader.so.0"

inherit rpm
