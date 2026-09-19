SUMMARY = "Shared library for NTP client applications"
DESCRIPTION = "This package provides the shared library for ntp clients."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "libntpc1-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "9e44c703933eed90edf5df6a589de85b45a876913869a3bfc64acf7c99ca6dc2a1f9eb0de9f3e945360c8fac6224f102d7ae2a7f2a92ff139f1b8eaff1ae1a11"

RPROVIDES:${PN} += "libntpc.so.1 \
libntpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
