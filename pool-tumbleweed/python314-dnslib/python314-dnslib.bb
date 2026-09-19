SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.26"

RPM_NAME = "python314-dnslib-0.9.26-1.5.noarch.rpm"
RPM_HASH = "a4f4d98166487bc4f17a62e79a590b67ec4acc6704c3e4d9526fbf8282e9d21ec704c6531e692e528c6dca5d3b30c680a885366cd1a59f8a3ce36790f6eb8ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dnslib \
python314-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
