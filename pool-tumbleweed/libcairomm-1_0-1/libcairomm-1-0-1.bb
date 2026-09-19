SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.6"

RPM_NAME = "libcairomm-1_0-1-1.14.6-1.1.aarch64.rpm"
RPM_HASH = "60c7541ccd6859f6eb87e301832dc5a6e4e7be1966a7e0982bfb360384ba06979cd8419ce47debb11553534b35ff9196c7ac687b79b4a11ea8a95003f23e1825"

RPROVIDES:${PN} += "libcairomm-1-0-1 \
libcairomm-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
