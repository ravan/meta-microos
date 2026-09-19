SUMMARY = "Plugin AOM encoder and decoder for AVIF"
DESCRIPTION = "This plugin provides the AOM encoder and decoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-aom-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "6c14edc4561f7501e5eb5f017df9aa57fb3ec8863a450933f5d4ea681b0bb518496e9e368fe8e1f70484af19ba89bd342101a82bf80c2aba3375cea0d197a3e8"

RPROVIDES:${PN} += "libheif-aom \
libheif-aomdec.so \
libheif-aomenc.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libstdc++.so.6"

inherit rpm
