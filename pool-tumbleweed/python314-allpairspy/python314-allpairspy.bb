SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.1"

RPM_NAME = "python314-allpairspy-2.5.1-3.5.noarch.rpm"
RPM_HASH = "886f2abf56213e322eee6cef223ba28957e816fb57596cee3686c6e3c11f4cacf577c52385ba6ca7370a48fd6cdc8a66c421d00ceef12385aefb7fa83d9c13c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-allpairspy \
python314-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
