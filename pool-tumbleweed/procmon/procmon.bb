SUMMARY = "Trace the syscall activity on the system"
DESCRIPTION = "Process Monitor (Procmon) is a Linux reimagining of the classic Procmon \
tool from the Sysinternals suite of tools for Windows. Procmon provides \
a convenient and efficient way for Linux developers to trace the syscall \
activity on the system."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "procmon-1.0.1-4.11.aarch64.rpm"
RPM_HASH = "2617684de37a22e93f95d3dd7a2c7ce22d1610662124aa477aa1a3f618884cf9f39beb79c67c09432c358d61c9d955f928ffb03e674ccba7f6a45e371ee7ca11"

RPROVIDES:${PN} += "procmon"

RDEPENDS:${PN} += "kernel-devel \
ld-linux-aarch64.so.1 \
libbcc.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpanel.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
