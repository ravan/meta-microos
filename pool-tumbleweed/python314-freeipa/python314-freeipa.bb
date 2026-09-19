SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python314-freeipa-1.0.6-2.5.noarch.rpm"
RPM_HASH = "f39068cfa016363558475dcbb40a1fe42ac0cf0b420d1e140ef7d4c981cb56a1ce3ecf69f776537f60fbbf680149209d1afc3251294f850b77d7c1ec4e123341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-freeipa \
python314-freeipa \
python3dist-python-freeipa"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
