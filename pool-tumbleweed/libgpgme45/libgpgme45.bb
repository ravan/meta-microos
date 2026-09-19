SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libgpgme45-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "0feaf269bb74f200ec556bb4400eef03a23ffcdf16fbf27d8cfff9b56bd085cb15843af1c928e968e93a1c2a5c6e3091cb303997cadd7aa8eef4b0c5c29aeafb"

RPROVIDES:${PN} += "libgpgme.so.45 \
libgpgme45"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
