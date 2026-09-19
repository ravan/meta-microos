SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python314-csscompressor-0.9.5-4.5.noarch.rpm"
RPM_HASH = "6a608bd56924d140a6c5c28141c22b304db5a68e58d4480d137f57c83e2fd82a292505fb20098fadd4976742684de1e0c4a712d446babd07a482898dd441a5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-csscompressor \
python314-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
