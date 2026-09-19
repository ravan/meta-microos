SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.1"

RPM_NAME = "libcairomm-1_16-1-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "a8755d19ecb8634163dcfc513f42b79b99c6dc8d0ba8bc880255bc8edcabdbbf7767a27127bcb823f674cee7c983cbe32b6b4588b9d07a0031e156e8311a0a13"

RPROVIDES:${PN} += "libcairomm-1-16-1 \
libcairomm-1.16.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
