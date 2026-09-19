SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python314-rnc2rng-2.7.0-1.9.noarch.rpm"
RPM_HASH = "e4181ce7c7c782566e77a3a19aa59e31b6beca550ab5de0743874433c818fd764709d66562a7a01bcb41e677f2f6a79d3dbf4e7e398a6be02172786ad08f0f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rnc2rng \
python314-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-rply \
update-alternatives"

inherit rpm
