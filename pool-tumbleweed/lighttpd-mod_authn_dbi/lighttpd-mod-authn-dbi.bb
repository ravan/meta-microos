SUMMARY = "Authentication module for lighttpd that uses DBI"
DESCRIPTION = "Authentication module for lighttpd that uses DBI"
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_authn_dbi-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "0a42bcfb545222efa11f9eed1cd33cf7c7ba1190c793e82aa1bcdfe213763f75c4d50ad0563b0d1850c3dfba419af6caef66e0253c001c95a7e2d63c635228c9"

RPROVIDES:${PN} += "lighttpd-/usr/lib64/lighttpd/mod-authn-dbi.so \
lighttpd-mod-authn-dbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdbi.so.3 \
libnettle.so.8 \
lighttpd"

inherit rpm
