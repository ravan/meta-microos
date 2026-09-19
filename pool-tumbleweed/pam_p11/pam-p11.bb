SUMMARY = "PAM Authentication Module for Using Cryptographic Tokens"
DESCRIPTION = "Pam_p11 is a pluggable authentication module (pam) package for using \
cryptographic tokens, such as smart cards and usb crypto tokens, for \
authentication. \
 \
Pam_p11 has limited functionality since it simply compares public \
keys to sign some random data and verifies the signature with the \
public key. This works fine for small installations but may have \
security implications, see README.SUSE."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "pam_p11-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "61611605d450d7f582d5889970315467e706eb68dfa6488b30ee52ef9ac44c65ba317881888f2eac762c6a1b76bfbbc301e7af7e7ac22f11643012da0ed1ac86"

RPROVIDES:${PN} += "pam-p11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libp11.so.3 \
libpam.so.0"

inherit rpm
