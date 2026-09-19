SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python313-csscompressor-0.9.5-4.5.noarch.rpm"
RPM_HASH = "c5a381066ac61bf8fcb55fdd2a1ae18a675c9c428893a586fd5cbccba6072db99517a58a3ea3e305f81b4d370835074232b4b8d63eb6e06dc0b2f375e8f8ac14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csscompressor \
python3.13dist-csscompressor \
python313-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
