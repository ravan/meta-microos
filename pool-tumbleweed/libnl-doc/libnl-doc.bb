SUMMARY = "Documentation for libnl, a library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "GPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "libnl-doc-3.12.0-1.2.noarch.rpm"
RPM_HASH = "ae67857a288fcdf49ea19105458739a1b3fb8d7927dcb8613b17bfc46f056a726af1f0099e6d347c861ea00ee54e7c3ed80c8c497279290b90f4b600e95a1df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnl-doc"

RDEPENDS:${PN} += ""

inherit rpm
