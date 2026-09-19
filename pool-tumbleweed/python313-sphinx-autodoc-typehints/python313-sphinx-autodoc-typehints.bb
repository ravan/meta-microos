SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "3.13.2"

RPM_NAME = "python313-sphinx-autodoc-typehints-3.13.2-1.1.noarch.rpm"
RPM_HASH = "78ea1de89fd39d22b22d806c964b6c3c86ecc5cb66524c766b2fdcf950ebd0c4d79e9256ecaf6ab534b11807e878c414eee021cd6a2bc94a8f542c6165864208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autodoc-typehints \
python3.13dist-sphinx-autodoc-typehints \
python313-sphinx-autodoc-typehints \
python3dist-sphinx-autodoc-typehints"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
