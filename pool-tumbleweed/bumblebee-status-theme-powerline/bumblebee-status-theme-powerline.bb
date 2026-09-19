SUMMARY = "Bumblebee themes using awesome and powerline fonts"
DESCRIPTION = "Bumbebee themes using awesome-fonts and powerline-fonts."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-theme-powerline-2.1.5-4.7.noarch.rpm"
RPM_HASH = "28a1509df2762ed429c74661384db87bfdd99234399c71b4e66590d91a58b544b2c1b65d5c9d7359aa454becf244a7c55a7af377507deec35c3ccb6208fbf737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-theme-powerline"

RDEPENDS:${PN} += "bumblebee-status \
fontawesome-fonts \
powerline-fonts"

inherit rpm
