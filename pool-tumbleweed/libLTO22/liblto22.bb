SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "libLTO22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "6d63fe86ce37c86bf9f33ee1be2e636178beb3b693384ac4c2b0d5b4a71636b8deb33e1bbf27f7d77e3b8d4b37875ee605745f899e62e75f5800d1a60e644293"

RPROVIDES:${PN} += "libLTO.so.22.1 \
libLTO22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
