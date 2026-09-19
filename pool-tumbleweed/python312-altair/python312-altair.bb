SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python312-altair-5.2.0-3.4.noarch.rpm"
RPM_HASH = "d89b11fe34267ad6879cb8464762a58a5275cbabd7517de0fd1e94034e6d553fd5e483942fe2e393ec737ad209ab62641760de4eef76d21c7e1191b583f4f448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-altair \
python312-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python312-Jinja2 \
python312-jsonschema \
python312-numpy \
python312-packaging \
python312-pandas \
python312-toolz"

inherit rpm
