SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python314-guzzle_sphinx_theme-0.7.11-4.5.noarch.rpm"
RPM_HASH = "eb47d6225e60bc1fcd47306d2528133d4dacd8bff5a3d81f81cd5bd72df8bf23b6475a7e441ca06074a2c7f5276090a67677d17d1e7cbe9a8a24cdfd0cdaa7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-guzzle-sphinx-theme \
python314-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
