SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python314-sphinxcontrib-apidoc-0.6.0-1.2.noarch.rpm"
RPM_HASH = "b12640a70ef2ecd21bc9f4a05a8776dde5f8352b53541478d97f33fca455837b9db4956c38ed196ac69cb250ae182ec79ff4c5dd32c261268a454795478dcdb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-apidoc \
python314-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-pbr"

inherit rpm
