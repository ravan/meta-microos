SUMMARY = "LDAP YP Tools"
DESCRIPTION = "LDAP equivalents of yp tools ypcat, ypmatch and chsh"
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "ldap-yp-tools-1.13-3.9.aarch64.rpm"
RPM_HASH = "8b81e08184b342f30a1df48170a1b4ed8ef1d6deb8640ba92591e6ca54451c894e6b277c931d2f4e30b67a7c6a8e8ceebbe2eabafbda591344b3d8ecc87318f9"

RPROVIDES:${PN} += "ldap-yp-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
perl \
perl-Net--LDAP \
perl-URI"

inherit rpm
