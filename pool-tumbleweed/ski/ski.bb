SUMMARY = "Skiing simulation with curses interface in python"
DESCRIPTION = "Imagine you are skiing down an infinite slope, facing such hazards as \
trees, ice, bare ground, and the man-eating Yeti! Unfortunately, \
you have put your jet-powered skis on backwards, so you can't see \
ahead where you are going; only behind where you have been. However, \
you can turn to either side, jump or hop through the air, teleport \
through hyperspace, launch nuclear ICBMs, and cast spells to call the \
Fire Demon.  And since the hazards occur in patches, you can skillfully \
outmaneuver them. A fun and very silly game that proves you don't need \
fancy graphical user interfaces to have a good time."
LICENSE = "BSD-3-Clause"

PV = "6.16"

RPM_NAME = "ski-6.16-1.2.noarch.rpm"
RPM_HASH = "5ad0e1a216d724b8ad88d30237fc06a4f909313055c84a0831b511b124b0f7306916859422b4b26c3f4ce68600519cb38fa32a3a4d1422788170538cfd4f91d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ski"

RDEPENDS:${PN} += "/usr/bin/env \
python3 \
python3-curses \
python3-pygame"

inherit rpm
