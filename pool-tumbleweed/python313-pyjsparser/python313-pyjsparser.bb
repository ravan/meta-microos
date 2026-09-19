SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python313-pyjsparser-2.7.1-3.10.noarch.rpm"
RPM_HASH = "ccc8eaa9fc1f939ce81831395878017933ac31c34037066d7366dd639d43b66438f050e2b784d2fb8da8221c76c6f5fa319f4c8ee1350287e9dba76740b0a602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjsparser \
python3.13dist-pyjsparser \
python313-pyjsparser \
python3dist-pyjsparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
