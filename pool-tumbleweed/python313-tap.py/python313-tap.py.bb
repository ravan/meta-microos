SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python313-tap.py-3.1-2.5.noarch.rpm"
RPM_HASH = "0e62dbbc5951c60e860ed4bb50f955759744cfc42736679bde576d19d99ca5f041f45b66342114d6f4116924d75d104ce0ba6b87b8bbcefee64f222d0feddf73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tap.py \
python3.13dist-tap.py \
python313-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
