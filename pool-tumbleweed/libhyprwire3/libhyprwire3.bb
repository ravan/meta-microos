SUMMARY = "A wire protocol for IPC"
DESCRIPTION = "Hyprwire is a wire protocol, and its eponymous implementation. This \
is essentially a method for processes to talk to each other."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libhyprwire3-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "f8a8dc1daf562415f60fffc2847bab14fe58b1958b5d82d92e7bebf9d081a0d58ec97162fd2c413cfdd461d565c0103fb97a540ee98d01ea3bb7c1fac5a1f17c"

RPROVIDES:${PN} += "libhyprwire.so.3 \
libhyprwire3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
