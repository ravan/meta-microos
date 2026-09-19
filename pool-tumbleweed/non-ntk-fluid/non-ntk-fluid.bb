SUMMARY = "Fast Light User Interface Designer"
DESCRIPTION = "Fast Light User Interface Designer, an interactive GUI designer for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-fluid-1.3.1001-5.7.aarch64.rpm"
RPM_HASH = "ca43cbc6b66265a585b3580c6b249a7db84938f2b996359cb85f67f4cb9435bbf68813826bc63c251a394e1f1d46c7980cece4ade459384bb371d4b6894a5176"

RPROVIDES:${PN} += "non-ntk-fluid"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
non-ntk-devel"

inherit rpm
