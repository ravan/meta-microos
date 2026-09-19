SUMMARY = "A Jupyter extension for rendering Bokeh content -- jupyter files"
DESCRIPTION = "A Jupyter extension for rendering Bokeh content within Jupyter. \
 \
This package provides the jupyter labextension"
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "jupyter-bokeh-4.0.5-1.9.noarch.rpm"
RPM_HASH = "6ea209b5696780cd12ca0d76fbf955aaa7b713ba6a3b4998b71a01cc0097b795325d586f43390f4661af45f8af6c74eace040fa50ddab17321df230d4dace8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bokeh"

RDEPENDS:${PN} += "python3dist-jupyter-bokeh"

inherit rpm
