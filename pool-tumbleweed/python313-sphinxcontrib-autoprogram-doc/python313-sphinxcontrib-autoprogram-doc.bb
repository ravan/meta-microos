SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.9"

RPM_NAME = "python313-sphinxcontrib-autoprogram-doc-0.1.9-2.5.noarch.rpm"
RPM_HASH = "0f99318e304b4dcc36a2d57b894f47b80bf332c233d18018b527c6970ef8df168cb019a7ed0ef01f0b7fb10cd09c76142c7ad5fb6c7c614bfac7d98ff4546db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram-doc \
python313-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python313-Sphinx"

inherit rpm
