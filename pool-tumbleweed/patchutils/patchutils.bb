SUMMARY = "A Collection of Tools for Manipulating Patch Files"
DESCRIPTION = "Patchutils contains a collection of tools for manipulating patch files: \
interdiff, combinediff, filterdiff, fixcvsdiff, rediff, lsdiff, and \
splitdiff. You can use interdiff to create an incremental patch between \
two patches that are against a common source tree. Combinediff can be \
used for creating a cumulative diff from two incremental patches. \
Filterdiff is for extracting or excluding patches from a patch set \
based on modified files matching shell wildcards. Lsdiff lists modified \
files in a patch. Rediff corrects hand-edited patches."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "patchutils-0.4.5-1.3.aarch64.rpm"
RPM_HASH = "3ded9674d3df4ee3ca5041ba349d1f73190ee66f79976e9e3467063d5f41381d5c14f85d5bd92f86d2df89465df8ce29284997d186823ed37e7a7590988aa29a"

RPROVIDES:${PN} += "patchutils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-posix.so.3 \
patch"

inherit rpm
