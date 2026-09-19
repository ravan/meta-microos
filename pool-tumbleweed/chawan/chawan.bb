SUMMARY = "Terminal-based web browser and pager"
DESCRIPTION = "Chawan is a text-based web browser and pager designed to run entirely \
in a terminal. The browser supports HTML with CSS styling, inline image \
rendering in compatible terminals, and JavaScript execution for \
interactive pages."
LICENSE = "Unlicense"

PV = "0.3.3"

RPM_NAME = "chawan-0.3.3-2.4.aarch64.rpm"
RPM_HASH = "0646482399f067d12d4ea1c2a0a13faf471f78786b3ea23c3dcbd2306685f35ffddb523e5ce1dc53d534f47c04a00366e35fb82b41a1fa5186180d847a2b416d"

RPROVIDES:${PN} += "chawan"

RDEPENDS:${PN} += "/usr/bin/sh \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssh2.so.1 \
libssl.so.3"

inherit rpm
