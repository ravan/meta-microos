SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python313-sphinxcontrib-pecanwsme-0.11.0-2.5.noarch.rpm"
RPM_HASH = "295316a77fed046e577a603afa9e434f54b6f289c8602ce06b40ba3fe09c0d0de431c43c4e0f30ab3699dedc3168c4225f5651ead8f797317f0264e32720dfbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-pecanwsme \
python3.13dist-sphinxcontrib-pecanwsme \
python313-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python313-sphinxcontrib-httpdomain"

inherit rpm
