SUMMARY = "Header files for frozen, an alternative to gperf"
DESCRIPTION = "Header-only library that provides 0 cost initialization for immutable \
containers, fixed-size containers, and various algorithms. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "frozen-devel-1.2.0-1.8.noarch.rpm"
RPM_HASH = "94e6a613aca8fbfbc41e41b0de242b2aa2f913582348d9a66108853e8fe1fdad64ec0012afce557b407847af35f114d5640bac7e761fdeabd14597f96c3c90f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-frozen \
frozen-devel"

RDEPENDS:${PN} += ""

inherit rpm
