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

RPM_NAME = "python313-Sphinx-9.1.0-2.1.noarch.rpm"
RPM_HASH = "383818d6c69226ef9a0b1289b40dde880776600b4d556cc3db43b83b0a9b41ac969b3df96a57ea6f0278757eaf0e245071edfa1f925a475e606b2de2e8ecc2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx \
python3.13dist-sphinx \
python313-Sphinx \
python3dist-sphinx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Babel \
python313-Jinja2 \
python313-Pygments \
python313-alabaster \
python313-defusedxml \
python313-docutils \
python313-imagesize \
python313-packaging \
python313-requests \
python313-roman-numerals \
python313-snowballstemmer \
python313-sphinxcontrib-applehelp \
python313-sphinxcontrib-devhelp \
python313-sphinxcontrib-htmlhelp \
python313-sphinxcontrib-jsmath \
python313-sphinxcontrib-qthelp \
python313-sphinxcontrib-serializinghtml"

inherit rpm
