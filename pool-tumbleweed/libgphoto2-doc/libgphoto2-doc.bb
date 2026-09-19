SUMMARY = "Documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is the user documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2-doc-2.5.34-1.3.noarch.rpm"
RPM_HASH = "eced06ac02682ae5ed03ec7106e60690e24fb6cf8f9eaf5366e6a3720d5c6cd4906f186f7d207108ad019bf0a3ad1b9d2801bc569ba8c7e18fb3b3d623042e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-doc"

RDEPENDS:${PN} += ""

inherit rpm
