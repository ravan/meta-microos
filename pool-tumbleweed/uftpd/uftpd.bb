SUMMARY = "A combined TFTP/FTP server"
DESCRIPTION = "uftpd serves both TFTP and FTP without any configuration file, starts \
automatically from the traditional UNIX inetd super server, and is \
tcpwrapped."
LICENSE = "ISC"

PV = "2.17"

RPM_NAME = "uftpd-2.17-1.1.aarch64.rpm"
RPM_HASH = "da1b556f2b1e9cbea59a4a8234e5580c2eeacf17618e2adb843401fba314545bf4e908d09c67013d5222b87057f0e0a43205c3e221bf7491c650ee504e62459c"

RPROVIDES:${PN} += "tftp-server \
uftpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libite.so.5 \
libuev.so.3"

inherit rpm
