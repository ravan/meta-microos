SUMMARY = "Python documentation generator"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). It was originally created for the Python documentation, and \
supports Python project documentation well, but C/C++ is likewise \
supported. \
 \
Sphinx uses reStructuredText as its markup language. Sphinx draws from \
the parsing and translating suite, the Docutils."
LICENSE = "BSD-2-Clause"

PV = "9.1.0"

RPM_NAME = "python314-Sphinx-9.1.0-2.1.noarch.rpm"
RPM_HASH = "4dd2b533661b3de8f8be99b82cea8a6b5af0ebaf27d44c4b50d7f548f67187f64bf7d93e7611c18bc98819df9014b7943c68ec5f7a7538ccf3164070750665c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx \
python314-Sphinx \
python3dist-sphinx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Babel \
python314-Jinja2 \
python314-Pygments \
python314-alabaster \
python314-defusedxml \
python314-docutils \
python314-imagesize \
python314-packaging \
python314-requests \
python314-roman-numerals \
python314-snowballstemmer \
python314-sphinxcontrib-applehelp \
python314-sphinxcontrib-devhelp \
python314-sphinxcontrib-htmlhelp \
python314-sphinxcontrib-jsmath \
python314-sphinxcontrib-qthelp \
python314-sphinxcontrib-serializinghtml"

inherit rpm
