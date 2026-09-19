SUMMARY = "[global] extra for python314-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python314-pytoolconfig-global-1.3.1-1.11.noarch.rpm"
RPM_HASH = "82429b86d2b5b16a707019b62ef88d11051afe9742496dc61430206ecc0740f8cd76f82df998c1eaa7c85b5104207e225e3d1287a208924dfe3f10e01aff8a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pytoolconfig-global"

RDEPENDS:${PN} += "python314-platformdirs \
python314-pytoolconfig"

inherit rpm
