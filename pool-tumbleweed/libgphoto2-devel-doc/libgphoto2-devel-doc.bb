SUMMARY = "Development documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is its API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2-devel-doc-2.5.34-1.3.noarch.rpm"
RPM_HASH = "d5607c32e58d92eb82d4106cabea12a4cd8a0988528d451ed4ef7ddd3e2cabc7550c800bcd066441637f038507b03995c19c6aedff2da4959ee1cbafd295f239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
