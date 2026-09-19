SUMMARY = "Debug information for package mingw32-mpfr"
DESCRIPTION = "This package provides debug information for package mingw32-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-debug-3.1.2-3.1.noarch.rpm"
RPM_HASH = "a9de53b6ea84ce6cd94c7ec6171bea57940dcccbc8b33203ebdcdee6aa28b4800355ddf9d415f591b0c2130775963ad5d7cccdad7534cfd5f2efaac20e002b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpfr-debug"

RDEPENDS:${PN} += ""

inherit rpm
