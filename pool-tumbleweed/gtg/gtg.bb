SUMMARY = "Personal Organizer for GNOME"
DESCRIPTION = "Getting Things GNOME! (GTG) is a personal organizer for the GNOME desktop \
environment inspired by the Getting Things Done (GTD) methodology. GTG is \
designed with flexibility, adaptability, and ease of use in mind so it can be \
used as more than just GTD software. \
 \
GTG is intended to help you track everything you need to do and need to know, \
from small tasks to large projects."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "gtg-0.6-1.16.noarch.rpm"
RPM_HASH = "600da8f4741c45f847c8fcdc40203484b4591ba580adb9504604aeb7d862c79444c30a8f223774cd6f7ebea9645ca0529905181fb9e6c29a403d1f11e7d7e0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
python3-liblarch \
python3-liblarch-gtk \
python3-lxml \
python3-pycairo"

inherit rpm
