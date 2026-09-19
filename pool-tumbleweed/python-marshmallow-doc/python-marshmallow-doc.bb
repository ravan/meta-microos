SUMMARY = "Documentation files for python-marshmallow"
DESCRIPTION = "HTML Documentation and examples for python-marshmallow."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.3.0"

RPM_NAME = "python-marshmallow-doc-4.3.0-1.2.noarch.rpm"
RPM_HASH = "a549330f88863169b064ac9209ac71bd9b5c4778e9f5307f6da5c1538058cc6c632d1fc623203091552f5299f47c93441f76c763175b67d3a86cfaf00c5f0262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-marshmallow-doc \
python-marshmallow-docs"

RDEPENDS:${PN} += ""

inherit rpm
