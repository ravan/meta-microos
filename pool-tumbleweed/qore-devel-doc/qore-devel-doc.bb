SUMMARY = "C++ API documentation for the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides HTML documentation for the C++ API for the Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-devel-doc-2.2.1-1.1.noarch.rpm"
RPM_HASH = "3d7a7f8c4dbfee20e875148838e4774ddfebb894dfb0e9dfc4f8d45c6b82456a5d857a08d08c310eb6e3081242466998b7092e238fb5e547e2180ef0f7c5b964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-devel-doc"

RDEPENDS:${PN} += "libqore12"

inherit rpm
