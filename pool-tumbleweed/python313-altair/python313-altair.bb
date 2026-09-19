SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "python313-altair-6.2.2-2.1.noarch.rpm"
RPM_HASH = "56bf03330f2596ad5e5dd98170833a87bc213029cee21da57cc93dc575eb54307de4b7f387c07c2d1b21612e3f88c575a849692b47d42327ca96e66cf9caf757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altair \
python3.13dist-altair \
python313-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-jsonschema \
python313-narwhals \
python313-packaging \
python313-typing-extensions"

inherit rpm
