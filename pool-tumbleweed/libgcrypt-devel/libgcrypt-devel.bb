SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose library of cryptographic building \
blocks.  It is originally based on code used by GnuPG.  It does not \
provide any implementation of OpenPGP or other protocols.  Thorough \
understanding of applied cryptography is required to use Libgcrypt. \
 \
This package contains needed files to compile and link against the \
library."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.12.4"

RPM_NAME = "libgcrypt-devel-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "31d7ddcd18f81115d72355066f1d6202b1f3069698bcfb7b4556eb9fa9e894987721ffe712d802059f73da0747b67c41ba73e65cbce5addbb49fd853d14d790b"

RPROVIDES:${PN} += "libgcrypt-devel \
pkgconfig-libgcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
jitterentropy-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgcrypt20 \
libgpg-error.so.0 \
pkgconfig-gpg-error"

inherit rpm
