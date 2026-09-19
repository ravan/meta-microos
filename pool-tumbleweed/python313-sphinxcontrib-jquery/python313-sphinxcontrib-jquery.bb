SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python313-sphinxcontrib-jquery-4.1-3.12.noarch.rpm"
RPM_HASH = "1552e95f25a55c565b1ccd10edc983a6f0e0c0f45a8b1a4db1f3ed6c95b8f66577144072ae476149c77ee19547c06483eb7eda9c5f53b766964f9be241c0438d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jquery \
python3.13dist-sphinxcontrib-jquery \
python313-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
