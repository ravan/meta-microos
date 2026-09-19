SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.7"

RPM_NAME = "python314-sphinx-tabs-3.4.7-3.4.noarch.rpm"
RPM_HASH = "11155db6cd1d917ea4b0d6f5ad7fa6a77b20c2e29de21edd537039e148ff19179e72a249e0df3c856d0615a7fe387e8d9472b9552e0ae5b65122072244712949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-tabs \
python314-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python314-Pygments \
python314-Sphinx \
python314-docutils"

inherit rpm
