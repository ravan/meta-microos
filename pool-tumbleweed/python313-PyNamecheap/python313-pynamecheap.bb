SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python313-PyNamecheap-0.0.3-3.5.noarch.rpm"
RPM_HASH = "1311ff39c271feb6cae4cc32b538f9e4b63482913cc2bb71a1371a9b8a4003fb837ef0a1857459fbae221e4f60f0165a19ae51a9832f2d2cc320691630623038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyNamecheap \
python3.13dist-pynamecheap \
python313-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
