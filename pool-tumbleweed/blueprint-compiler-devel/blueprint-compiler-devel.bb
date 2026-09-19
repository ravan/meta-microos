SUMMARY = "Development files for blueprint-compiler"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.22.2"

RPM_NAME = "blueprint-compiler-devel-0.22.2-1.1.noarch.rpm"
RPM_HASH = "dedde467cde7813d75121a272082f481d868bbcb1faaaf4e344d560053df5d8078046e37103556fc7a1d2e8302884de288a11d665a15109e2231ed27bc496337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler-devel \
pkgconfig-blueprint-compiler"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blueprint-compiler"

inherit rpm
