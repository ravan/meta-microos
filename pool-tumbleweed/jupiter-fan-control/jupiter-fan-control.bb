SUMMARY = "Steam Deck Fan Controller"
DESCRIPTION = "SteamOS 3.0 Steam Deck Fan Controller"
LICENSE = "GPL-3.0-or-later"

PV = "20240523.3"

RPM_NAME = "jupiter-fan-control-20240523.3-1.4.noarch.rpm"
RPM_HASH = "aa6a7b9d71ece525af94ccf746f193e236ccc18f2ec8a6729692654717eab571780a0282e010d1897aa83db38f66546aabdc4720350bdc931e73d39cc091b595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupiter-fan-control"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3 \
python3-PyYAML"

inherit rpm
