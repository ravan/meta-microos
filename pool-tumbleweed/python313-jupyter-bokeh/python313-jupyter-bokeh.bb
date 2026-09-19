SUMMARY = "A Jupyter extension for rendering Bokeh content"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python313-jupyter-bokeh-4.0.5-1.9.noarch.rpm"
RPM_HASH = "88f4fe3fb4f9cdbb855159d6b7f5d0e1c7e5aae293ecf792c11b29a9a9abc9cb59dd71a3923289d9dceef85ce0497d88c3b7f2501ad247b1577315856cd03de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-bokeh \
python3.13dist-jupyter-bokeh \
python313-jupyter-bokeh \
python3dist-jupyter-bokeh"

RDEPENDS:${PN} += "-python313-bokeh >= 3 with python313-bokeh < 4 \
-python313-ipywidgets >= 8 with python313-ipywidgets < 9 \
jupyter-bokeh \
python-abi"

inherit rpm
