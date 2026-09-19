SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.1"

RPM_NAME = "libsigc++2-devel-2.12.1-2.11.aarch64.rpm"
RPM_HASH = "99c68d0128fb69ab182c9157b323c0f10efe768e0e1bb1fb65f2997a5ed77dbc9538c381ff2242d508a3456b60b51d5ebb0b8a68377a19bc885433b22bd02c37"

RPROVIDES:${PN} += "libsigc++2-devel \
pkgconfig-sigc++-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigc-2-0-0 \
libstdc++-devel"

inherit rpm
