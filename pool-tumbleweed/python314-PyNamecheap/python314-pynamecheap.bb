SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python314-PyNamecheap-0.0.3-3.5.noarch.rpm"
RPM_HASH = "4fdc8fc37a84ea481f4273e34dad7d4e538cc5dfd47a3fe2267acb4893c8ce544d4c4de39c5cb8bdb41d62b99c0365cabe235150e1552ef8857ecd243f2caf72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynamecheap \
python314-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
