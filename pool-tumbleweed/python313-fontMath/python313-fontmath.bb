SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-fontMath-0.10.0-1.3.noarch.rpm"
RPM_HASH = "ce9c9277e01e582ac6af666f908f40609387672b742719f08b69c1a2a8b830720d707ce251f7492e48ec6ff20604ef41e40d4ed754f94593c431680293377379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontMath \
python3.13dist-fontmath \
python313-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python313-FontTools"

inherit rpm
