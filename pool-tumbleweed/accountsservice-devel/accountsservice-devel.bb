SUMMARY = "Header files for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-devel-23.13.9-12.3.aarch64.rpm"
RPM_HASH = "d8cc8f31ec9ddbbdfb4cde35ad54096746e4844fa0430d400ebc60c8ce90f916349b88115b9e61e591f034a405717ad74873a5bb1e180879c0a540a462ecc405"

RPROVIDES:${PN} += "accountsservice-devel \
pkgconfig-accountsservice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccountsservice0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-polkit-gobject-1 \
typelib-1-0-AccountsService-1-0"

inherit rpm
