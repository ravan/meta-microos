SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python314-parsy-2.2-1.4.noarch.rpm"
RPM_HASH = "29e4b64131b8ce3d777b44944b9e08d184caae6056cac41272fcd313ab6134f64f237b460a1cb4f8d635b8ce9a80db79a433c195cf61a7f05226ca1a60670506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parsy \
python314-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
