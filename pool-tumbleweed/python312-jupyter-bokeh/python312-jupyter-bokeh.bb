SUMMARY = "A Jupyter extension for rendering Bokeh content"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python312-jupyter-bokeh-4.0.5-1.5.noarch.rpm"
RPM_HASH = "3a5c5737efb81915d8488e0817c718ce8b5fe8725029585dc0886caa237b3af073b13ba58fd4275ef23b61c771a29908a170d0ae6e34709ec9f21b859c137e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-jupyter-bokeh \
python312-jupyter-bokeh \
python3dist-jupyter-bokeh"

RDEPENDS:${PN} += "-python312-bokeh >= 3 with python312-bokeh < 4 \
-python312-ipywidgets >= 8 with python312-ipywidgets < 9 \
jupyter-bokeh \
python-abi"

inherit rpm
