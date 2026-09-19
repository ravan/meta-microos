SUMMARY = "Header files for the RTL2832 dongle library"
DESCRIPTION = "Turns RTL2832 dongle into a 433.92MHz generic data receiver. \
 \
This subpackage contains header files for developing applications that want \
to make use of rtl_433."
LICENSE = "GPL-2.0-only"

PV = "25.12"

RPM_NAME = "rtl_433-devel-25.12-1.5.noarch.rpm"
RPM_HASH = "b988175e41dd9a02e4f833cd50d18a07aa8d4e66da61063ff1fcd0c10248fdad755022d0eafdb7948fe45188ceede0316ce15fdf239336431cd6f90276e5d9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rtl-433-devel"

RDEPENDS:${PN} += "rtl-433"

inherit rpm
