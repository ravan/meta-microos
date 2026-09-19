SUMMARY = "Runtime environment for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the runtime environment for systemtap programs."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-runtime-5.5-1.3.aarch64.rpm"
RPM_HASH = "a2c4cd8c774c7b69d091b621c38929ead5ce7c14f8ecdf983549a6aef1123cf1898577e8b609d68752dc9eceabba9faf85603ab277a0904499a3b85e5d566360"

RPROVIDES:${PN} += "systemtap-runtime"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libstdc++.so.6"

inherit rpm
