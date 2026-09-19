SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python313-uritemplate-4.2.0-1.4.noarch.rpm"
RPM_HASH = "a2b02550ac8a17edddccbeed62d4c041a90191e0c31c9d01d1b609a380aa38ccdcdd2a4a1f164f8bec7e9f10a0406c57d73d67676e818291bfbeb1bb6670e9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritemplate \
python3.13dist-uritemplate \
python313-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
