SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-httpdomain-2.0.0-1.4.noarch.rpm"
RPM_HASH = "1973b67faf26a5b6a10cd70f127fd578d463d7de869d7f2a2c167c81567626875e8d04a16544849af2ef01594fd180c329764bc3e9d03d95206872d0d8fb5973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-httpdomain \
python314-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
