SUMMARY = "Vala bindings for accountsservice"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package contains the Vala bindings for accountsservice."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-vala-23.13.9-12.3.aarch64.rpm"
RPM_HASH = "ac11eac8440113791b3933586639252852a207b47b778f5ca004b5c55b3195a1c99257521599a389c564790fac6cb6eb1bc119ea7d37c1ba18f2b3d7909f5cfa"

RPROVIDES:${PN} += "accountsservice-vala"

RDEPENDS:${PN} += "libaccountsservice0 \
typelib-1-0-AccountsService-1-0"

inherit rpm
