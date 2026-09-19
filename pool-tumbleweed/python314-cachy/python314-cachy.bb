SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-cachy-0.3.0-7.5.noarch.rpm"
RPM_HASH = "edeef5dbbe1315a5119d79f7e163ecefa4d308de9a94bb2a5a2bbc7717d6d4a36a696eee95d112824a08dd9f54e99134e6f908cb89006429bffa345fb742d82b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cachy \
python314-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
