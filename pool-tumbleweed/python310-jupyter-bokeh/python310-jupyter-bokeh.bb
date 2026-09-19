SUMMARY = "A Jupyter extension for rendering Bokeh content"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python310-jupyter-bokeh-4.0.5-1.2.noarch.rpm"
RPM_HASH = "604acfc000336e9356abdf6c6f3764995d02f9066f5cdc7e36f2ad2013a9ce6ac537bc2a7798eaf0cc6dfdde1b4fc92da938460b1d3468cf85f2d2a9b43716b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-bokeh \
python310-jupyter-bokeh \
python3dist-jupyter-bokeh"

RDEPENDS:${PN} += "-python310-bokeh >= 3 with python310-bokeh < 4 \
-python310-ipywidgets >= 8 with python310-ipywidgets < 9 \
jupyter-bokeh \
python-abi"

inherit rpm
