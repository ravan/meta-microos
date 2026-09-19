SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "groff-1.23.0-6.4.aarch64.rpm"
RPM_HASH = "e6d744dac3a95e44724930bfa3b728f2023c5941678256462d2081ca32091f29813cf1d5aac7ccc4aa5e54d0e90ef5d4ca4a5e3e606570c14a7ecf6453aadaf6"

RPROVIDES:${PN} += "config-groff \
groff \
soelim"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
soelim-common"

inherit rpm
