SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python314-uritemplate-4.2.0-1.4.noarch.rpm"
RPM_HASH = "91f8d7dc03daddfbc051fd7cd4724d5420cbfadf76c29dad7600074e1fb63b597a13372ef425eb8f7822c106fdd0d839e8cca9faac0ab08226430d40e71b6e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uritemplate \
python314-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
