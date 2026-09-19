SUMMARY = "Mail User Agent"
DESCRIPTION = "Alpine is a display-oriented email client that is suitable for both \
the inexperienced email user as well as for the most demanding of \
power users. Alpine is based on the Pine® Message System, which was \
also developed at the University of Washington. Alpine can be learned \
by exploration and the use of context-sensitive help. The user \
experience is highly customizable through the use of the Alpine Setup \
command."
LICENSE = "Apache-2.0"

PV = "2.26"

RPM_NAME = "alpine-2.26-31.3.aarch64.rpm"
RPM_HASH = "576c301397d04b4a2c28bc71c6d280636b373c4857c84e7edd7b8c9d83a0937b60b90b5e525a2c456c39d3271743b562ab322fe3d303cf95edc14bc5990c4101"

RPROVIDES:${PN} += "alpine \
pine \
pine4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libssl.so.3 \
libtinfo.so.6"

inherit rpm
