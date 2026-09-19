SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.26"

RPM_NAME = "python313-dnslib-0.9.26-1.5.noarch.rpm"
RPM_HASH = "5eab79b12fe80219350c21ee55f04aa4ec9a23520ef77539d6246eb9ac6f4a07c02736990b3ee6295127d5e7a8d88d5ad9bbb2f65e50df99dc663941893cd165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnslib \
python3.13dist-dnslib \
python313-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
