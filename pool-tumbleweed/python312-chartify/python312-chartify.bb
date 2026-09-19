SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "4.0.5"

RPM_NAME = "python312-chartify-4.0.5-1.6.noarch.rpm"
RPM_HASH = "38c4431e8d4b312f487a897689d015ae22582536413c54a914afb62f6801f85ececbca3a2c416e6bd86f524b0e8e69fbe2ef2e5fd4faa3ec510a8bd628625dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-chartify \
python312-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "python-abi \
python3.12dist-bokeh \
python3.12dist-ipykernel \
python3.12dist-ipython \
python3.12dist-jinja2 \
python3.12dist-jupyter-bokeh \
python3.12dist-pandas \
python3.12dist-pillow \
python3.12dist-pyyaml \
python3.12dist-scipy \
python3.12dist-selenium \
python3.12dist-tornado"

inherit rpm
