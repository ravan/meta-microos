SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python311-altair-5.2.0-3.4.noarch.rpm"
RPM_HASH = "356e36eac8236b8ac1148ed6b1c469a8c1bfb93a25a1a8328a87a1ae307f4d1cf42810ae354882e17314c589b9bd717486d806c9a5a8ac2e0677b3328fcddce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-altair \
python311-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-jsonschema \
python311-numpy \
python311-packaging \
python311-pandas \
python311-toolz"

inherit rpm
