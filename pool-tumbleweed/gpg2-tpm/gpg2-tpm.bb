SUMMARY = "TPM2 support for GnuPG"
DESCRIPTION = "Version 2.3 of GnuPG introduced support for converting GPG private \
keys to TPM2 wrapped form.  This package enables that support.  The \
keytotpm command will not function unless this package is installed."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.22"

RPM_NAME = "gpg2-tpm-2.5.22-1.1.aarch64.rpm"
RPM_HASH = "d40788d07d7bf5eb6ddb35c392b1137d7886a66e8db299cb174d602e9783bee59741b4c63a35b161c34165d39deb6a41f78ecd648a9efe426a5ad51163322a96"

RPROVIDES:${PN} += "gpg2-tpm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libibmtss.so.2 \
libnpth.so.0"

inherit rpm
