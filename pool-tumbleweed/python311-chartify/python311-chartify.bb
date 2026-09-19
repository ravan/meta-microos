SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "4.0.5"

RPM_NAME = "python311-chartify-4.0.5-1.6.noarch.rpm"
RPM_HASH = "6e0ecbcc53a04f1ea991fa9c35d0734c6a92c641d2340ff2fbdc480d30c7af6e0f0e73e3af5b8c74c5e30fd7fbf8bc55d576a9df100ab51291ff80d307c99889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-chartify \
python311-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "python-abi \
python3.11dist-bokeh \
python3.11dist-ipykernel \
python3.11dist-ipython \
python3.11dist-jinja2 \
python3.11dist-jupyter-bokeh \
python3.11dist-pandas \
python3.11dist-pillow \
python3.11dist-pyyaml \
python3.11dist-scipy \
python3.11dist-selenium \
python3.11dist-tornado"

inherit rpm
