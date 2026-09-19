SUMMARY = "Data files for trigger-rally"
DESCRIPTION = "This package provides the data files for trigger-rally, a 3D rally simulation \
with a physics engine for drifting, over 100 maps, different terrain materials \
like dirt, asphalt, sand, ice etc. and various weather, light and fog conditions. \
Most maps are equipped with spoken co-driver notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.7"

RPM_NAME = "trigger-rally-data-0.6.7-1.1.noarch.rpm"
RPM_HASH = "5a073825788da32109e818e86c6a85778c622920702380c8e75a92150149301234ce6b2e8dcb7421d988a3340209a39f12bde9ab5fabc8763cb2fc2fb38c1f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trigger-rally-data"

RDEPENDS:${PN} += "trigger-rally"

inherit rpm
