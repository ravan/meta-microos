SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python313-chartify-5.0.1-1.3.noarch.rpm"
RPM_HASH = "2f8885c23630e531746551e9d77cee83321e936e1bffe07c307b892e680eda4adcaf14ae133def8eee0f4374405dc7e444d7a7a803c9d85fcd04bc14ff027b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chartify \
python3.13dist-chartify \
python313-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "python-abi \
python3.13dist-bokeh \
python3.13dist-ipykernel \
python3.13dist-ipython \
python3.13dist-jinja2 \
python3.13dist-jupyter-bokeh \
python3.13dist-pandas \
python3.13dist-pillow \
python3.13dist-pyyaml \
python3.13dist-scipy \
python3.13dist-selenium \
python3.13dist-tornado"

inherit rpm
