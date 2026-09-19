SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.4"

RPM_NAME = "python314-furl-2.1.4-1.5.noarch.rpm"
RPM_HASH = "f6211846851ac66e1199ab66704cdadf0cb817a40a88d660ba07cbdc1370b6c0a737826869b31db41f7cd0f996ea24aa09af9e506ef9eb05ac4224bc9a4f6662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-furl \
python314-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python314-orderedmultidict"

inherit rpm
