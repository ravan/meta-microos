SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-websupport-2.0.0-1.2.noarch.rpm"
RPM_HASH = "e82405ef52ae72ff10ce47bd65ca1c83128f60e4ea181059c8a294157abe4e7d1c829f472529c64c5528629f7ae885342a6738721c2e1e60d98e87998ef6c009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-websupport \
python314-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Sphinx \
python314-sphinxcontrib-serializinghtml"

inherit rpm
