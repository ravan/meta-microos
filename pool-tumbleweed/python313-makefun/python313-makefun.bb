SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.16.0"

RPM_NAME = "python313-makefun-1.16.0-2.5.noarch.rpm"
RPM_HASH = "1ec0107ea08db66a1349a4b7d3b187681df4527da5633e43d2e0e4eba66007f82a9caaf10075ceb4aec10000b7601baedb4ca446959af8d48f27e38d3677d559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-makefun \
python3.13dist-makefun \
python313-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
