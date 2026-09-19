SUMMARY = "Documentation for libldl"
DESCRIPTION = "Documentation for libldl."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libldl-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "2a416ba2f06a54c941dd04ff19f4613630c18b17aee9863a87afd74c21f8a679c0044de458df84fae76be084813c5f6334ccbcfe357715dd10b7bd6b4d4d57ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libldl-doc"

RDEPENDS:${PN} += ""

inherit rpm
