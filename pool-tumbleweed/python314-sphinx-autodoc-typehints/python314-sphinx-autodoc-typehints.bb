SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "3.13.2"

RPM_NAME = "python314-sphinx-autodoc-typehints-3.13.2-1.1.noarch.rpm"
RPM_HASH = "1fb436a56c761a6560c1721001b4d68251f8fdb4ca4d76616fcdb304468ed825d01642528af6003d7e8409243aff096e0b66b303466d79910b8441f09fc38b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-autodoc-typehints \
python314-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
