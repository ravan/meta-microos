SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv-doc-4.13.0-2.1.noarch.rpm"
RPM_HASH = "f22f58f78c1a2bfd54d0998513b1cca40b4e0ba0a04b118b9ba6fc7361088a21fb9c449bd6395522e933dd0f28c84fd3a5b3275a8bc931d90c3bd81feb855ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-doc \
opencv-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
