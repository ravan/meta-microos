SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons)."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kparts-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "d44e0ea6951201ab2eb61b13ca06d968990edb982c54f64c69826fb14007cecdea2193b72cdedfb8edd5098f2274a72591e529cdb5fb1e3b6e8e364fbf7c4cc0"

RPROVIDES:${PN} += "kf6-kparts"

RDEPENDS:${PN} += ""

inherit rpm
