SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python314-tap.py-3.1-2.5.noarch.rpm"
RPM_HASH = "197b2209b211acad5e2e772c282be0c684535d71706aff2681ab468d523da4f0fbd941b681e55687e5680f2be5f0ded262c3718f045d8d42a8177085c84bfa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tap.py \
python314-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
