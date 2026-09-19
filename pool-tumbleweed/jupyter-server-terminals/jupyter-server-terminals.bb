SUMMARY = "Jupyter Server Extension registration for python*-jupyter-server-terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals. \
This package provides the jupyter server registration"
LICENSE = "BSD-3-Clause"

PV = "0.5.4"

RPM_NAME = "jupyter-server-terminals-0.5.4-1.4.noarch.rpm"
RPM_HASH = "41571bf399cd194fcfc64eb0ec655854bc5fa30ed625b64a86368d8e8cdc276e871856685a4f5a50777cbf85583fc9313cac800a5ae944b2844b5182a55aacd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-terminals"

RDEPENDS:${PN} += "python3dist-jupyter-server-terminals"

inherit rpm
