SUMMARY = "An authentication service for creating and validating credentials"
DESCRIPTION = "MUNGE (MUNGE Uid 'N' Gid Emporium) is an authentication service for \
creating and validating user credentials.  It is designed to be highly \
scalable for use in an HPC cluster environment.  It provides a portable \
API for encoding the user's identity into a tamper-proof credential \
that can be obtained by an untrusted client and forwarded by untrusted \
intermediaries within a security realm.  Clients within this realm can \
create and validate credentials without the use of root privileges, \
reserved ports, or platform-specific methods."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.18"

RPM_NAME = "munge-0.5.18-1.4.aarch64.rpm"
RPM_HASH = "c1df14b65b4be5cf2d3fcdea0723e8f55536cc560bfd8be880255c61d25af3f261f5ec896b7c2711a481ab522f501ae7fa30c6d1d8c1efa61b3552fcdad84de6"

RPROVIDES:${PN} += "config-munge \
group-munge \
munge \
user-munge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libmunge.so.2 \
libz.so.1 \
logrotate \
shadow \
systemd"

inherit rpm
