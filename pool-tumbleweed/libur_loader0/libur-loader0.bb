SUMMARY = "oneAPI Unified Runtime loader"
DESCRIPTION = "oneAPI Unified Runtime (UR) provides a unified interface to device \
agnostic runtimes such as DPC++. \
 \
This package contains the oneAPI Unified Runtime loader."
LICENSE = "Apache-2.0"

PV = "0.11.10"

RPM_NAME = "libur_loader0-0.11.10-2.1.aarch64.rpm"
RPM_HASH = "8e25ff226bd80fda181e6aa4690b332ca9a91ab5635af3a4c4a9a633abee8d34855af55992c2c6bf09da96c0e51d6d836e5132cc2b64250a912abde30acbd291"

RPROVIDES:${PN} += "libur-loader.so.0 \
libur-loader0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
