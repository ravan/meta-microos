SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python314-chartify-5.0.1-1.3.noarch.rpm"
RPM_HASH = "71e7dae2e9a153c400cc2299ea4a49f276463bf981134ab8e0f8dccb14e35df4a545d38183b8f39caf6d91d31660d49403e790d5d382e435ff03dd1a42ee7624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-chartify \
python314-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "python-abi \
python3.14dist-bokeh \
python3.14dist-ipykernel \
python3.14dist-ipython \
python3.14dist-jinja2 \
python3.14dist-jupyter-bokeh \
python3.14dist-pandas \
python3.14dist-pillow \
python3.14dist-pyyaml \
python3.14dist-scipy \
python3.14dist-selenium \
python3.14dist-tornado"

inherit rpm
