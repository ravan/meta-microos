SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.5.4"

RPM_NAME = "python314-jupyter-server-terminals-0.5.4-1.4.noarch.rpm"
RPM_HASH = "e095b9773f02579abe763844f56b3f0fd9b89c9f876301f5c8c67899dea0b5816fbe7117a45fd64020c4bf72a03cc8c86a823c6e2caf6b1ba9e62b829b8355ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-server-terminals \
python314-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python314-terminado"

inherit rpm
