SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-tinyrecord-0.2.0-3.5.noarch.rpm"
RPM_HASH = "c2ee8d0ae9cadd3bdbb933946dcfbe8cb0110623a873548cad72e79890dae32f5744dd953ad9d09c46cd5a22426273db6130bde1a4be78184eb692cd87df2cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tinyrecord \
python314-tinyrecord \
python3dist-tinyrecord"

RDEPENDS:${PN} += "python-abi \
python314-tinydb"

inherit rpm
