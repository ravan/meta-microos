SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python313-pydata-sphinx-theme-0.21.0-1.1.noarch.rpm"
RPM_HASH = "3d1f01f5c541375e4d76ebb646feef33c29c0fb024e18b24c63ff4de4eb494a4ca283f4f8ac1b99b99a10b178dd09992c72ac82ed99b8c56e862398e358330a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-sphinx-theme \
python3.13dist-pydata-sphinx-theme \
python313-pydata-sphinx-theme \
python3dist-pydata-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-Jinja2 \
python313-Sphinx \
python313-accessible-pygments \
python313-beautifulsoup4 \
python313-docutils \
python313-pygments \
python313-requests"

inherit rpm
