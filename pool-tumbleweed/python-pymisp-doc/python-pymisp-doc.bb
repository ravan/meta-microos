SUMMARY = "Examples and Documentation for python-pymisp"
DESCRIPTION = "Examples and HTML documentation for python-pymisp."
LICENSE = "BSD-2-Clause"

PV = "2.5.17.3"

RPM_NAME = "python-pymisp-doc-2.5.17.3-1.4.noarch.rpm"
RPM_HASH = "684b9fed955d44f3c6046874cdc3cc71a1bb924f9c3e83216c7761c2c475ba35d3296dff69f934d66f76b23d7fa601f326682ba2528e877f461bbb64256a415b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymisp-doc"

RDEPENDS:${PN} += ""

inherit rpm
