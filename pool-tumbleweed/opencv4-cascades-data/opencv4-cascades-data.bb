SUMMARY = "Classifier cascades for OpenCV"
DESCRIPTION = "Haar and LBP cascades for face and object detecton"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv4-cascades-data-4.13.0-2.1.noarch.rpm"
RPM_HASH = "619551f0ee1d63d73e6c549c507f1d3949f3094d513b49ecdf60574bb6d5024f1117124544529610a1286dcebf5c4b1d221311e53276aa59fb20d1bd333fa0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-/usr/share/opencv4/lbpcascades/lbpcascade-silverware.xml \
opencv4-cascades-data"

RDEPENDS:${PN} += ""

inherit rpm
