SUMMARY = "Simulation of a full-scale war between two emperors"
DESCRIPTION = "The ancestor of all 4x (expand/explore/exploit/exterminate) games. \
VMS-Empire is a simulation of a full-scale war between two emperors, \
the computer and you. Naturally, there is only room for one, so the \
object of the game is to destroy the other. The computer plays by the \
same rules that you do. This game is the ancestor of all the multiplayer \
4X simulations out there, including Civilization and Master of Orion."
LICENSE = "GPL-2.0-only"

PV = "1.20"

RPM_NAME = "vms-empire-1.20-1.3.aarch64.rpm"
RPM_HASH = "e53489d09464953fc018b08cb0b5f7204e4ea584965266974d644c4d25744a34c549b65010909782f286f4faf5496104028da20e9e52589db73d4ac64cf0f608"

RPROVIDES:${PN} += "vms-empire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
