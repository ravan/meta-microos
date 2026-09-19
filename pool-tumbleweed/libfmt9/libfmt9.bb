SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "libfmt9-9.1.0-1.12.aarch64.rpm"
RPM_HASH = "7e2e96e6c7a61f32372bd2b606490e682d580f710c921685854ad25777599ee94d976f090d5e279f2c135a8a04884d6dcf0fc76f3a05a82a1d43460445844cc2"

RPROVIDES:${PN} += "libfmt.so.9 \
libfmt9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
