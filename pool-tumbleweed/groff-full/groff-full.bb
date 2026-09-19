SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "groff-full-1.23.0-6.5.aarch64.rpm"
RPM_HASH = "e82e6fda222557ac5cb4c75e9f87aafeee6a02742311139835f1a2f03cf1717081142b767d2e33705b97134eb25356ffeb47449a52bb2c5f5a59d7531dc352a6"

RPROVIDES:${PN} += "groff-devx \
groff-full \
jgroff \
normal-groff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ghostscript-library \
groff \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
netpbm \
psutils \
update-alternatives"

inherit rpm
