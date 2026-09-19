SUMMARY = "Divides large result sets into pages for easier browsing"
DESCRIPTION = "Divides large result sets into pages for easier browsing"
LICENSE = "MIT"

PV = "0.5.7"

RPM_NAME = "python313-paginate-0.5.7-1.9.noarch.rpm"
RPM_HASH = "8bd064d10f504594240cfb0b53e1b87c2ca079b8c45130ef394353209a16da684cee01a5dc52c133059a21d6d7f313040ce3085642e3c03f7b8183058a789a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paginate \
python3.13dist-paginate \
python313-paginate \
python3dist-paginate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
