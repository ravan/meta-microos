SUMMARY = "Client library for the user account information manipulation D-Bus service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides a client library for the service."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "libaccountsservice0-23.13.9-12.3.aarch64.rpm"
RPM_HASH = "23a47d20e853985cad0025457d45c0399418c7b6d1b1bb210cf9ce37592c180c47713d246d90b32ba78e06eeb06fd7fcba9f89540ec2a9cf5545dd0d8737092c"

RPROVIDES:${PN} += "libaccountsservice.so.0 \
libaccountsservice0"

RDEPENDS:${PN} += "/sbin/ldconfig \
accountsservice \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
