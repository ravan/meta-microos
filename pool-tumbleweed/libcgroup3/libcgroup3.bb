SUMMARY = "Control groups management library"
DESCRIPTION = " \
The shared library libcgroup 3.1.0 its self."
LICENSE = "LGPL-2.1-only"

PV = "3.1.0"

RPM_NAME = "libcgroup3-3.1.0-1.9.aarch64.rpm"
RPM_HASH = "299caa8982bfa896840d4d0ae92fe7fe80b81d2f21d1842b5fe9747665d35c3c2ccbb1db4f81ebe9e208f3df08cfbfc4bd0c9cf2a78566ba9310f0184bc9aca7"

RPROVIDES:${PN} += "libcgroup.so.3 \
libcgroup3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
