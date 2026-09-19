SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-websupport-2.0.0-1.2.noarch.rpm"
RPM_HASH = "508c9e2aa8882a7a5ddb2e8a60be4fd9e3f05fee0f38ac1e00877eff83534ef5dfb9c644392b5599b2e6eafc372ee8eb2be59d5e9eb5a04056da9215da41ea12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-websupport \
python3.13dist-sphinxcontrib-websupport \
python313-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Sphinx \
python313-sphinxcontrib-serializinghtml"

inherit rpm
