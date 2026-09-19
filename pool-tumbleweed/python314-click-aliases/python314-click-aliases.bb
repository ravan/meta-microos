SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python314-click-aliases-1.0.7-1.1.noarch.rpm"
RPM_HASH = "b5690edfd4c7c2b9c58c68f9a5a0b5d603d3f16ab3abfcd6a665cf9d21f4975f4015de28ede0b5babf9945adda723986eb5f14976295deb85b02c84ebdc8433f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-aliases \
python314-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
