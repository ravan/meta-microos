SUMMARY = "Debugs memory leak of a running process"
DESCRIPTION = "Memleax is capable of debugging memory leak of a running process by \
attaching to it. There is no need to recompile the program or restart the \
target process."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "memleax-1.1.1-3.13.aarch64.rpm"
RPM_HASH = "cab0825e5ffb83907ee2e70642b8d309babf585ccb57e8e4cb1485ad3528f2004c4ae164b3748183fe18fa12d738f0ef0ccdaf7a5c4c572be9e6c188f51898a3"

RPROVIDES:${PN} += "memleax"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libunwind-aarch64.so.8 \
libunwind-ptrace.so.0 \
libunwind.so.8"

inherit rpm
