SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-base58-2.1.1-3.5.noarch.rpm"
RPM_HASH = "453aadd1e03d8298fd065d23de17d524184da48794b7c505af616a91c040f91d9b34263602e1050d7f5cfd7a93b49aa860e77fd38a101ecd526ac4cb7b22ccaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-base58 \
python314-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
