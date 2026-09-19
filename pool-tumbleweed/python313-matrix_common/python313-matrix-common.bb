SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-matrix_common-1.3.0-2.5.noarch.rpm"
RPM_HASH = "992489c22853adf75ada866c4042efcb62d3bb49b8d42a59079c3523587b372bf2357994b7835c704ef7fb0f79ce24c740ee75462f5a430f7f985830d8781f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-common \
python3.13dist-matrix-common \
python313-matrix-common \
python3dist-matrix-common"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
