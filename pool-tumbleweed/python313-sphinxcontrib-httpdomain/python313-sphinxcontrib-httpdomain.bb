SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-httpdomain-2.0.0-1.4.noarch.rpm"
RPM_HASH = "1d17b6dbdc926dfdfa55232b3aa75967be3fd1b64bb8b78332d33f78e3a45f1998c2d555664dc772407a017b2e95f5eb6d88c7ee8b102deeeb0d48bdea805f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-httpdomain \
python3.13dist-sphinxcontrib-httpdomain \
python313-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
