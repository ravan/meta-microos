SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "gpgme-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "a3e956d04aea29d87cfb2e200b23a1cb3962d7f172b7bfbdb1c6c224ecf96d4e3be429ba91f4c1d651245b9ddee6d40ea65fa5849cc42b28ff57924fc9ad47df"

RPROVIDES:${PN} += "gpgme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgpg-error.so.0 \
libgpgme.so.45 \
libm.so.6"

inherit rpm
