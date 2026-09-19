SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python39-altair-4.2.2-1.6.noarch.rpm"
RPM_HASH = "c9c51860d12fa6a1139a04b9c6c20a0daf5aa92eb7b3c96ed553d129ec31450b233358c02ec2a8dde9c7558cfa44745cb02e215ccb69bd60d7d752b302b0fa1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-altair \
python39-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-entrypoints \
python39-jsonschema \
python39-numpy \
python39-pandas \
python39-toolz \
python39-typing"

inherit rpm
