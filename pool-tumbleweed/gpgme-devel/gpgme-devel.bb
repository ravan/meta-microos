SUMMARY = "Development files for GPGME, a C library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgme."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "gpgme-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "acc540e990e2b1744268a9a35763e76c0dd224718b7dd8c9b9c1dcbaada2e5b429a33cd4ce8d51b650ccf0ce817d2bfd381ca21a1c05c3b7e39aacc1b864a0ef"

RPROVIDES:${PN} += "gpgme-devel \
libgpgme-devel \
pkgconfig-gpgme \
pkgconfig-gpgme-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgpgme45 \
pkgconfig-glib-2.0 \
pkgconfig-gpg-error \
pkgconfig-libassuan"

inherit rpm
