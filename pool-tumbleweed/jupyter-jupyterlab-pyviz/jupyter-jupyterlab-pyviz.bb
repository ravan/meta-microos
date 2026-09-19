SUMMARY = "PyViz JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "jupyter-jupyterlab-pyviz-3.0.3-1.8.noarch.rpm"
RPM_HASH = "9f9cf89922919a7195f42ba7c516cd84ba8684836f7afc1f06bd92195078f874b0581187183cec1a29199cb21416b470f27d58e0788959fbaa39497d63838a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-pyviz"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-pyviz-comms"

inherit rpm
