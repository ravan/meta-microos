SUMMARY = "Osmocom GSM utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmogsm20-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "6c31cd2d688e2683e48298685f1f31ae6dea2208ee5de856e7771a0547d0389415b2a49de10da787b5dc2c425f07581011de46eb3d67485b8ba23a58d49668b4"

RPROVIDES:${PN} += "libosmogsm.so.20 \
libosmogsm20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libosmocore.so.22 \
libosmoisdn.so.0 \
libtalloc.so.2"

inherit rpm
