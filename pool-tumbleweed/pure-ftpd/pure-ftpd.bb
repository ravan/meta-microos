SUMMARY = "A Lightweight, Fast, and Secure FTP Server"
DESCRIPTION = "Pure-FTPd is a fast, production-quality, and standard-conforming FTP \
server, based-on Troll-FTPd. Unlike other popular FTP servers, it has \
no known security flaws, is trivial to set up, and is especially \
designed for modern Linux kernels (setfsuid and sendfile capabilities) \
. Features include: PAM support, IPv6, chroot()ed home directories, \
virtual domains, built-in LS, anti-warez system, bandwidth throttling, \
FXP, bounded ports for passive downloads, upload and download ratios, \
Apache log files, and more."
LICENSE = "BSD-3-Clause"

PV = "1.0.51"

RPM_NAME = "pure-ftpd-1.0.51-5.6.aarch64.rpm"
RPM_HASH = "bf7c66e39479c0deded305c98e35f0c98f0149875164fc11e81d69f711ee5b4c9f72c1f608187714adc2e39bbdee3ad4da29bd1c1cf379978714e2d6821384c3"

RPROVIDES:${PN} += "config-pure-ftpd \
ftp-server \
pure-ftpd \
pureftpd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libldap.so.2 \
libmariadb.so.3 \
libpam.so.0 \
libpq.so.5 \
libsodium.so.26 \
libssl.so.3 \
user-ftp"

inherit rpm
