SUMMARY = "Developer documentation for GTK"
DESCRIPTION = "This package contains developer documentation for version 4 of the GTK \
widget toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "gtk4-docs-4.22.5-1.1.noarch.rpm"
RPM_HASH = "388a6a52071618be51db70ba18ad6090502de3e1e3f1a1aefbda5cb8705b7321d72cfd09498cceee9ca12851ae8c40bc17afb6c4ace9eec6927f9799c762eb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-docs"

RDEPENDS:${PN} += ""

inherit rpm
