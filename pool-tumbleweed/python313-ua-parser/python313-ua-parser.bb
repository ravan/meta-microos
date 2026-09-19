SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python313-ua-parser-1.0.1-2.5.noarch.rpm"
RPM_HASH = "9509ba634a95e9c17de3e790ac70a7b7326b719365ba9a59bd093d15c90d531e51647dd019cce5d20dd972218d43b7ccba52dc95d367b28b6bc4eca4990a294f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ua-parser \
python3.13dist-ua-parser \
python3.13dist-ua-parser-builtins \
python313-ua-parser \
python3dist-ua-parser \
python3dist-ua-parser-builtins"

RDEPENDS:${PN} += "python-abi"

inherit rpm
