SUMMARY = "Client library for interacting with the Zeitgeist daemon -- Development Files"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-devel-0.3.18-13.12.aarch64.rpm"
RPM_HASH = "34be3b18964b9c0787952327238b19305863ec717b6910ae480d0d39161fd735256966de10b55d7333b6949db9939432d59ebdff1ae062319266e0d53c63bce0"

RPROVIDES:${PN} += "libzeitgeist-devel \
pkgconfig-zeitgeist-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzeitgeist-1-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
