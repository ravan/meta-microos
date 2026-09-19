SUMMARY = "The GNU Image Manipulation Program - Vala development files"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-vala-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "416912458a7a11d9a39a5da373fe651f9580dfd7addd5c6c3fb9edf59169a7cae98a733fc1a246fef769ce0b0478cbcb3fcd64554b8defbf40ea57c55bf590a4"

RPROVIDES:${PN} += "gimp-3.0-vala \
gimp-vala"

RDEPENDS:${PN} += "gimp-devel"

inherit rpm
