SUMMARY = "Call chain detection library for process self-inspection"
DESCRIPTION = "A C programming interface (API) to determine the call chain of a \
program from within the same process."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libunwind8-1.8.3-3.3.aarch64.rpm"
RPM_HASH = "07f1ebeff1e5b0292d049d03fb57243520fbf03083d04c1fd8a8fea6cf86a42fe5c9c298954d27b50727cafc25073178a39e9c0fad85164718186f1de1912f16"

RPROVIDES:${PN} += "libunwind-aarch64.so.8 \
libunwind.so.8 \
libunwind8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
