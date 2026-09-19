SUMMARY = "Unicode utilities"
DESCRIPTION = "This package consists of a set of programs for manipulating and analyzing Unicode text. The analysis utilities are useful when working with Unicode files when one doesn't know the writing system, doesn't have the necessary font, needs to inspect invisible characters, needs to find out whether characters have been combined or in what order they occur, or needs statistics on which characters occur."
LICENSE = "GPL-2.0-or-later"

PV = "2.28"

RPM_NAME = "uniutils-2.28-1.3.aarch64.rpm"
RPM_HASH = "e0fa14d36a8525aa8f4ec21a87a38714d0a20bd6f10c518b2788a03180239ec7eb2d8bdc2ea2dcce966cc4c175fa42544e571c1902a2bc9249509b998bfc79f7"

RPROVIDES:${PN} += "uniutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
