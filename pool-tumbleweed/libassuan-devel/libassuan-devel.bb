SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2) \
 \
gpgme also uses libassuan to communicate with a libassuan-enabled GnuPG \
v2 server, but it uses it's own copy of libassuan."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.0.2"

RPM_NAME = "libassuan-devel-3.0.2-1.7.aarch64.rpm"
RPM_HASH = "3523902bb147102843ebe33a2c0347abed3734439cd763092f9079dbf7bf7e9bd4bb39fcd3a4c78af234eecff41fcb6eb4966384304ff845f9f814d472e565e2"

RPROVIDES:${PN} += "libassuan-devel \
pkgconfig-libassuan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libassuan9 \
pkgconfig-gpg-error"

inherit rpm
