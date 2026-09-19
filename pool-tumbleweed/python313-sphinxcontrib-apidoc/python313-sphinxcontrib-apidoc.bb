SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python313-sphinxcontrib-apidoc-0.6.0-1.2.noarch.rpm"
RPM_HASH = "ee6194970c0010bc8c43c4b3b8305a0473e1f9bacc93cd9cbfe99dffcadddac04153dbfbbcdabbe186a519f393f6c6703051eb676c92cc80b2e5b68f1f45bec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-apidoc \
python3.13dist-sphinxcontrib-apidoc \
python313-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-pbr"

inherit rpm
