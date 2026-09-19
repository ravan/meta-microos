SUMMARY = "Pytest plugin for pook"
DESCRIPTION = "A pytest plugin for pook. \
 \
Tests that rely on pook can be marked with @pytest.mark.pook."
LICENSE = "LGPL-3.0"

PV = "1.0.0"

RPM_NAME = "python314-pytest-pook-1.0.0-1.2.noarch.rpm"
RPM_HASH = "e8181281306959534e153a61601f001bdb1dab3397e88341093bfb4bbd1cdb17ef41cf62b85f9acfce891b0258d7ce333bd6bd8ccfa7a70296bec62c52f43fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-pook \
python314-pytest-pook \
python3dist-pytest-pook"

RDEPENDS:${PN} += "python-abi \
python314-pook \
python314-pytest"

inherit rpm
