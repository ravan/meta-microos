SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "python314-altair-6.2.2-2.1.noarch.rpm"
RPM_HASH = "e3ab4a5e0f351d89a67b06ba3f46b9441a8ea83805a16270f4b878895ca943e20cc3344bb1e9746974a64f5eadb412a1f766a51db255ae39208f706d526b68c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-altair \
python314-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-jsonschema \
python314-narwhals \
python314-packaging \
python314-typing-extensions"

inherit rpm
