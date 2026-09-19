SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python314-pydata-sphinx-theme-0.21.0-1.1.noarch.rpm"
RPM_HASH = "4f4580e6020594ac33bdcc8f6a113c5d3517de1a769f80546beb10e70c2977530886cac7a0d0ffe9dd5cebbbdfc8e40a1f804142c004aaad749e2e67a216f7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydata-sphinx-theme \
python314-pydata-sphinx-theme \
python3dist-pydata-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python314-Babel \
python314-Jinja2 \
python314-Sphinx \
python314-accessible-pygments \
python314-beautifulsoup4 \
python314-docutils \
python314-pygments \
python314-requests"

inherit rpm
