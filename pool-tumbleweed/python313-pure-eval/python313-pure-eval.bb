SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python313-pure-eval-0.2.3-3.1.noarch.rpm"
RPM_HASH = "6254a634229c044ecf4fc62e38c90f564b65d74bccf1b7fd3562363b698b15c03203ac6f9d23c3cef2e9ab962fc9eeb4c200c0708c9cb58b0e4ea3b6fa07881e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-eval \
python3.13dist-pure-eval \
python313-pure-eval \
python3dist-pure-eval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
