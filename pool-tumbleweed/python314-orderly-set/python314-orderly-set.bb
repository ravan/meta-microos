SUMMARY = "Orderly set"
DESCRIPTION = "Orderly set"
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python314-orderly-set-5.5.0-1.2.noarch.rpm"
RPM_HASH = "b2fea747ac35293ebb94bcafb14ba6403e91524c77a22a839ef43d68fd833c7a8e747bd0412e8fe10c79068b1988a99d335902d81cc26ea8dfbca70160e1a94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-orderly-set \
python314-orderly-set \
python3dist-orderly-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
