SUMMARY = "YaST2 - Plugins for AppArmor Profile Management"
DESCRIPTION = "YaST2 forms and components for the management of AppArmor \
profiles."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-apparmor-5.0.1-1.9.noarch.rpm"
RPM_HASH = "b5debf49769dd22a2c29f7ad382551ca76c3b5785ac928c8120de105cd956e8d5eec5fc913fe707ac0435577fd92c822c0e8cc55f05d7d1023d05b97d087e20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-apparmor"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
