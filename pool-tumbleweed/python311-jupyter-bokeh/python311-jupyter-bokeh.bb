SUMMARY = "A Jupyter extension for rendering Bokeh content"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python311-jupyter-bokeh-4.0.5-1.5.noarch.rpm"
RPM_HASH = "36495de79b12773aa2e18c88f45602d59ef21614fd9e125e2fe53e530fa4d1000e68f31691cc35f2d0053521635a603370228e2a56d5b7b846e6e7cf28a45dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-bokeh \
python311-jupyter-bokeh \
python3dist-jupyter-bokeh"

RDEPENDS:${PN} += "-python311-bokeh >= 3 with python311-bokeh < 4 \
-python311-ipywidgets >= 8 with python311-ipywidgets < 9 \
jupyter-bokeh \
python-abi"

inherit rpm
