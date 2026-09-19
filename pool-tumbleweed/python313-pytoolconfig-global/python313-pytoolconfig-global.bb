SUMMARY = "[global] extra for python313-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python313-pytoolconfig-global-1.3.1-1.11.noarch.rpm"
RPM_HASH = "75d52c64996fbc9361eba3008406c251bf0aac3a754e8f6ab4acf702ac5cdd98a03a20c9929e051ccf7e54e24370658db8b5fb421bc61638378d6b6b18b3771f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-global \
python313-pytoolconfig-global"

RDEPENDS:${PN} += "python313-platformdirs \
python313-pytoolconfig"

inherit rpm
