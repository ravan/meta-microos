SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python314-autopage-0.6.0-1.3.noarch.rpm"
RPM_HASH = "995b613d8ade35accca6bddd1637a1c1cb4adbd8f2a81e7dbc539462240eaf7eb2093c3f11eaf3103478a8f3e4a49d2058adab71ccf1dab66659af2a8504c9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autopage \
python314-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
