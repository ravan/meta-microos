SUMMARY = "Javadoc for jffi"
DESCRIPTION = "This package contains the API documentation for jffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "jffi-javadoc-1.3.13-3.4.noarch.rpm"
RPM_HASH = "eff279b49c34f3a36f0edcf4101be20188409815dcc8d68cd98b7b361ae21576f861ac23931a314f3ec1888241b3dd342733cde94968a63fe21ab6568bd549b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jffi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
