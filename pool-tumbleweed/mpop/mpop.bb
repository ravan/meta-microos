SUMMARY = "Lightweight and featureful POP3 Client"
DESCRIPTION = "mpop is a small and fast POP3 client. Features include mail filtering, \
delivery to mbox files, maildir folders or a mail delivery agent, a \
very fast POP3 implementation, many authentication methods, good \
TLS/SSL support, IPv6 support, and more."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.22"

RPM_NAME = "mpop-1.4.22-1.3.aarch64.rpm"
RPM_HASH = "ebbe5e23ad105c47709e20caf5a7377d136f26a70f5be9877f316814789825f85e48e4c3ef53e327ca0ff2d22c260e9e6e5d081424405e6a32c15ae1b15128f9"

RPROVIDES:${PN} += "mpop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgsasl.so.18 \
libidn2.so.0 \
libresolv.so.2 \
libsecret-1.so.0"

inherit rpm
