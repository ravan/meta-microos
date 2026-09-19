SUMMARY = "D-Bus Service to Manipulate User Account Information"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
The implementation is based on the useradd, usermod and userdel \
commands."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-23.13.9-12.3.aarch64.rpm"
RPM_HASH = "8089dc8d851d507f0ba39d0927ce8166a07ccd3bcfff066c0b467590ecf94f8dc67b05096e61c96e8eddabb7c0bf24be74b5fbda74349c5c48362fdd7f03e91d"

RPROVIDES:${PN} += "accountsservice"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
