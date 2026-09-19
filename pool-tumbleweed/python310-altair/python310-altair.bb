SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python310-altair-4.2.2-1.6.noarch.rpm"
RPM_HASH = "634dd9cdf99bfac9b0da5b25388bbbba770324d9bc2f1b1aa77eef16d4340154aaa8c775a7195334a4bbf1062aef986937b84b9bfac06cb310fa66251ae82df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-altair \
python310-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-entrypoints \
python310-jsonschema \
python310-numpy \
python310-pandas \
python310-toolz \
python310-typing"

inherit rpm
