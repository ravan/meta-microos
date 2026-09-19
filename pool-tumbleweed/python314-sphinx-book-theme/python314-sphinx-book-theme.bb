SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python314-sphinx-book-theme-0.1.3-2.5.noarch.rpm"
RPM_HASH = "7103d6fa6eae45886bd18b7626debb3881d3ed28e1db26147897f82b3000239601745c0d779bbe756d3d63f48ddf2e8c8cd6a046c001484cfc6b66601afa07dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-book-theme \
python314-sphinx-book-theme \
python3dist-sphinx-book-theme"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-Sphinx \
python314-beautifulsoup4 \
python314-click \
python314-docutils \
python314-pydata-sphinx-theme"

inherit rpm
