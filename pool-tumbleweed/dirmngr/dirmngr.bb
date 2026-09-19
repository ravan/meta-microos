SUMMARY = "Keyserver, CRL, and OCSP access for GnuPG"
DESCRIPTION = "Since version  2.1 of GnuPG, dirmngr takes care of accessing the OpenPGP \
keyservers. As with previous versions it is also used as a server for managing \
and downloading certificate \
revocation lists (CRLs) for X.509 certificates, downloading X.509 certificates, \
and providing access to OCSP providers.  Dirmngr is invoked internally by gpg, \
gpgsm, or via the gpg-connect-agent tool."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.22"

RPM_NAME = "dirmngr-2.5.22-1.1.aarch64.rpm"
RPM_HASH = "377509474fe3b4138fb6afe538e0bece72308c2b7a7669506bc046ffd5ba64abdd7498c1d01e4a232aff9e474ba3371c7064e90bf647316799175679fa58c5c7"

RPROVIDES:${PN} += "dirmngr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0 \
libksba.so.8 \
liblber.so.2 \
libldap.so.2 \
libnpth.so.0"

inherit rpm
