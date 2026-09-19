SUMMARY = "Development files for the Osmocom GSM utility library"
DESCRIPTION = "The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogsm."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmogsm-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "193b5a2267b4d974e929c87749c3f0f511406d4d9214dc8d922038ec14f31ed00284eaa31945ac6fb581c6af13180c60a167ff7f986e866f0f8aaa4718801542"

RPROVIDES:${PN} += "libosmogsm-devel \
pkgconfig-libosmogsm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmogsm20 \
pkgconfig-libosmocore \
pkgconfig-libosmoisdn \
pkgconfig-talloc"

inherit rpm
