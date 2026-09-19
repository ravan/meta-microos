SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python314-pyviz-comms-3.0.3-1.8.noarch.rpm"
RPM_HASH = "14585e6f7a66b16261b80c725d647b97a93432b8d384e0c46025995fcacf5674b4ebb35f88420257d3a019b95d68e4de9f239ddfd04b7561b3cba23569856702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyviz-comms \
python314-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python314-param"

inherit rpm
