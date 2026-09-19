SUMMARY = "Very Secure FTP Daemon - Written from Scratch"
DESCRIPTION = "Vsftpd is an FTP server, or daemon. The 'vs' stands for Very Secure. \
Obviously this is not a guarantee, but the entire codebase was written \
with security in mind, and carefully designed to be resilient to \
attack. \
 \
Recent evidence suggests that vsftpd is also extremely fast (and this \
is before any explicit performance tuning!). In tests against wu-ftpd, \
vsftpd was always faster, supporting over twice as many users in some \
tests."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "3.0.5"

RPM_NAME = "vsftpd-3.0.5-18.6.aarch64.rpm"
RPM_HASH = "403560db1a2d567f4c5c4550de9aecda67b60d5af17e79f53cc887589a743208143aa4f6a735c87b3dc221ad1c302c627e2f824853aece9b4f61ec6a6074e3ff"

RPROVIDES:${PN} += "config-vsftpd \
ftp-server \
vsftpd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nobody \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libpam.so.0 \
libssl.so.3 \
logrotate \
shadow \
systemd \
user-ftp"

inherit rpm
