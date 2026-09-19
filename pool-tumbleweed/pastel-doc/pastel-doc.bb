SUMMARY = "Documentation for pastel"
DESCRIPTION = "This package provides the documentation for pastel."
LICENSE = "Apache-2.0 & MIT"

PV = "0.12.0"

RPM_NAME = "pastel-doc-0.12.0-1.6.noarch.rpm"
RPM_HASH = "50bff114a31df181346efe568039e431517754d294331494d8a82ad7ae407dc188af371470bf7fe920ef5f9c7f06c7ee6fbdce1cae76df9a1bc4cb20eb230e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pastel-doc"

RDEPENDS:${PN} += ""

inherit rpm
