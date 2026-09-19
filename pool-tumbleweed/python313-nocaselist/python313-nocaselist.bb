SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python313-nocaselist-2.2.1-1.1.noarch.rpm"
RPM_HASH = "c728cd1b1f5b780a0e529a26dd05364bd1449a5006c80d2b7b1e7cf6beadab31c7b1dd09ac949c87ccaff44a56c06dff20f67ec611fb4c7ab9aa72405ca3908f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocaselist \
python3.13dist-nocaselist \
python313-nocaselist \
python3dist-nocaselist"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
