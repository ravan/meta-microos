SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python313-sphinx-book-theme-0.1.3-2.5.noarch.rpm"
RPM_HASH = "45e015d43c349dd10ea9e38d7728ec32fdd0e7a642a8fd9ed2f77eb11a2003f4560de3d28d153240c6c91fed5bc2a1315d2acda3eef3fb9cbf3f7ecbd06a9fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-book-theme \
python3.13dist-sphinx-book-theme \
python313-sphinx-book-theme \
python3dist-sphinx-book-theme"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-Sphinx \
python313-beautifulsoup4 \
python313-click \
python313-docutils \
python313-pydata-sphinx-theme"

inherit rpm
