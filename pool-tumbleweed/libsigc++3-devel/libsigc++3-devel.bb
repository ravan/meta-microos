SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.8.0"

RPM_NAME = "libsigc++3-devel-3.8.0-2.3.aarch64.rpm"
RPM_HASH = "82a004dfa780b74345ecc76fb43b3b49fcd8392aeeaa8432fb17054699402fca33d1f59936f244385a7440d6465b86a4e84a57a11dcc37bca70ceaa95582c183"

RPROVIDES:${PN} += "libsigc++3-devel \
pkgconfig-sigc++-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigc-3-0-0 \
libstdc++-devel"

inherit rpm
