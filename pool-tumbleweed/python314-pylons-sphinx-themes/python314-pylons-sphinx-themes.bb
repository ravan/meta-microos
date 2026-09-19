SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python314-pylons-sphinx-themes-1.0.13-3.5.noarch.rpm"
RPM_HASH = "8966bf312c9d01dd18e6c03fd0b0aaf64a61c5da1616608a2c1d4cea4fcee16f1125411ee7c83bf76dacd7375f55095f2bc822214d1258a6a683ef7e819d377a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylons-sphinx-themes \
python314-pylons-sphinx-theme \
python314-pylons-sphinx-themes \
python314-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python314-Pygments"

inherit rpm
