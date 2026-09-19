SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.1"

RPM_NAME = "cairomm-doc-1.18.1-1.1.noarch.rpm"
RPM_HASH = "141ec1a61785d50f27cbb1063c7959d6b56053e3afc7848559ac0ea3b6b1deb8e794ba4af73aab04f5d355f51746cbda97612f7731f0a2279d1a885c02ed4e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cairomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
