SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python314-requirements-parser-0.13.0-1.2.noarch.rpm"
RPM_HASH = "0a383f1b528f29122a124405ec63c0cf157fda90f8407e11bb597ccf21375a2e71dd002ac61933cdd5ac897b1b892a0b78d745dcf501a8577a3a0a3d541a79ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requirements-parser \
python314-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
