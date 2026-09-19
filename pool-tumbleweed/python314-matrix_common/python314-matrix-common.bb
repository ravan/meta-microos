SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-matrix_common-1.3.0-2.5.noarch.rpm"
RPM_HASH = "544209fbb43d9a786d690555d1fac4a4c5e8e67247bfdbd00a30cc5390699172a1be2fb17b704ecaa2c1c4bb97d1eb244923d497444d762b0517500cb26237a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-matrix-common \
python314-matrix-common \
python3dist-matrix-common"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
