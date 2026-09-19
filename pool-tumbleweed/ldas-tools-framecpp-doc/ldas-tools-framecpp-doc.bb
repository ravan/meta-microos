SUMMARY = "HTML documentation for ldas-tools-framecpp API"
DESCRIPTION = "This package provides the API documentation for ldas-tools-framecpp in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "ldas-tools-framecpp-doc-3.0.4-2.7.noarch.rpm"
RPM_HASH = "ec0a8f8e140c362234e5a836184091281d889841fa0544fd8c73dabc0277b3a9d738c2af64b012d4f4940a584ed9d8cebbfb45601ba774638b91b31247d56526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldas-tools-framecpp-doc"

RDEPENDS:${PN} += ""

inherit rpm
