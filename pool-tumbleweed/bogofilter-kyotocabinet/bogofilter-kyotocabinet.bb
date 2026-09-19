SUMMARY = "Bogofilter kyotocabinet backend"
DESCRIPTION = "This package contains bogofilter build with the tokyocabinet backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "bogofilter-kyotocabinet-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "cc6e1b98d006a869e93650a15ff19eb6b5a71732354dfa1f008f038819d5a288a20a4595224208c1510bcc73abb68afdfcd941e8fe11c329d3643aed0ffc281a"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-kyotocabinet \
bogofilter-tokyocabinet"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
libkyotocabinet.so.16 \
libm.so.6 \
update-alternatives"

inherit rpm
