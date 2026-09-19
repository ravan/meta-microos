SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package provides a C++ library for accessing LDAP (Version 3) \
Servers"
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "libldapcpp0-2.6.13-1.3.aarch64.rpm"
RPM_HASH = "c9cc5a6e887ba7e88f0bc70f43e17a1ac722b9638b0067b0484cf44a1624d18955956dddf051a4ca10374e673a36e36b8709d769ef4c5845627c8feea1b7ce36"

RPROVIDES:${PN} += "ldapcpplib \
libldapcpp.so.0 \
libldapcpp0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblber.so.2 \
libldap.so.2 \
libstdc++.so.6"

inherit rpm
