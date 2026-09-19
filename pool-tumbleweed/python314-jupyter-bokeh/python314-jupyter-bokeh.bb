SUMMARY = "A Jupyter extension for rendering Bokeh content"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python314-jupyter-bokeh-4.0.5-1.9.noarch.rpm"
RPM_HASH = "3754ba619e9e019e67cef8c916d2c8a8cffef024b952f6d3cb7d31ac7433d9ee31cb04d3973f2c75c85c4dd942934eee62935b97fc3382cdf0d1b6230d20c218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-bokeh \
python314-jupyter-bokeh \
python3dist-jupyter-bokeh"

RDEPENDS:${PN} += "-python314-bokeh >= 3 with python314-bokeh < 4 \
-python314-ipywidgets >= 8 with python314-ipywidgets < 9 \
jupyter-bokeh \
python-abi"

inherit rpm
