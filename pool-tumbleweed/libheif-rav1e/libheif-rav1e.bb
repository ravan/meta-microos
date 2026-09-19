SUMMARY = "Plugin rav1e encoder for AVIF"
DESCRIPTION = "This plugin provides the rav1e encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-rav1e-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "8f3c0b4bafea154d3667a654c805b55125d81e6e9bf0b9508a9d2d5f55397fddb2ca67344b8f1327849ca6a1beea7b39926d088a558701650c4752e11c0e76d5"

RPROVIDES:${PN} += "libheif-rav1e \
libheif-rav1e.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
librav1e.so.0.8 \
libstdc++.so.6"

inherit rpm
