SUMMARY = "Records nondeterministic executions and debugs them deterministically"
DESCRIPTION = "This program aspires to be your primary debugging tool, enhancing gdb. It \
also provides efficient reverse execution under gdb. Set breakpoints and \
data watchpoints and quickly reverse-execute to where they were hit."
LICENSE = "MIT"

PV = "5.9.0"

RPM_NAME = "rr-5.9.0-2.7.aarch64.rpm"
RPM_HASH = "749c2f20f41cb245ff141c589090a1fe6ebba9266fd5a284df1bf7212f1fc90877c2dad95d12710f6d862421b0bfc513c90b1b62a5e3f8b9a1485abb320ce9a1"

RPROVIDES:${PN} += "librraudit.so \
librrpreload.so \
rr"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp.so.1.5.0 \
libgcc-s.so.1 \
libkj.so.1.5.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
