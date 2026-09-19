SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt6/PyQt6"
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python314-qpageview-1.0.3-1.3.noarch.rpm"
RPM_HASH = "99405c0c0114990de36dd2d3a4f667dc230aeb3f6a06675af648543cd072ce53d745b6694f82fab6bba5b260d3a709a6f76effee00eb815dbb094878ddf795ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qpageview \
python314-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python314-qt6"

inherit rpm
