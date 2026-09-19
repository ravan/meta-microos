SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python313-pyviz-comms-3.0.3-1.8.noarch.rpm"
RPM_HASH = "16c97ab4df7329a184164c928ac19bebde0f40a99f3ef7052902976050cb344392cd0fbcbe07527fecf4e3015a86546df2c3dca275ada933b463efca0b5cf77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyviz-comms \
python3.13dist-pyviz-comms \
python313-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python313-param"

inherit rpm
