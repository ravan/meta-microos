SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python314-contexter-0.1.4-3.5.noarch.rpm"
RPM_HASH = "5c4ff823f6c795bb5fc3069a643e0d21ae96a08047d94b392df8c296053893f4a9334b5e91123fdd3f744903b9026d0a9577ccde159f5621cab54c86cd19ae94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-contexter \
python314-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
