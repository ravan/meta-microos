SUMMARY = "Development headers for i3"
DESCRIPTION = "Development headers for the i3 window manager."
LICENSE = "BSD-3-Clause"

PV = "4.25.1"

RPM_NAME = "i3-devel-4.25.1-1.6.noarch.rpm"
RPM_HASH = "7474a682274f1fe652fb71c815499d23ebca0f4dbb035f292d0435df15e19cfc2b4b64fe3c97a484020f1c4dd817b30ad516ef59594b3951185fe73b9e34785c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "i3-devel"

RDEPENDS:${PN} += "i3"

inherit rpm
