SUMMARY = "Include Files and Libraries for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using functions provided by the TidyLib library."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "libtidyp-devel-1.04-16.38.aarch64.rpm"
RPM_HASH = "a76a68f5b2fc5fb23de68578469637248c7c5c9233afecc36e966d56de266eb98171f546283eb611fd761b3463ef82204420018efc34b94ff1c23ddc1f3dd3cd"

RPROVIDES:${PN} += "libtidyp-devel"

RDEPENDS:${PN} += "glibc-devel \
libtidyp-1-04-0"

inherit rpm
