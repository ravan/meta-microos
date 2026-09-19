SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python314-pyjsparser-2.7.1-3.10.noarch.rpm"
RPM_HASH = "4f76f85a0d8631239489d5c28cf5d7959ac9773fb0429dd1300e960cd0cc1b3729b5e8cccee6be08265403500d43e9422234e3c51af585a3f934f2dd22603f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyjsparser \
python314-pyjsparser \
python3dist-pyjsparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
