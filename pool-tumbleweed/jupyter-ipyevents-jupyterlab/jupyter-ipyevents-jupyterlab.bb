SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "jupyter-ipyevents-jupyterlab-2.0.4-1.4.noarch.rpm"
RPM_HASH = "fcbfd0f26e50a8bd7d6e202680bfcdf2105fad4847820c2a17e7344e5fafde639a2ae68c79d8b9df911f7f001239b3c1e68dd37715690eab854f73563f1c53d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyevents"

inherit rpm
