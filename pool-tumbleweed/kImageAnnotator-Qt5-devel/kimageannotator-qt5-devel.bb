SUMMARY = "Development files for kImageAnnotator-Qt5"
DESCRIPTION = "Development files for kImageAnnotator-Qt5 including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "kImageAnnotator-Qt5-devel-0.7.2-1.3.aarch64.rpm"
RPM_HASH = "8289eb8a39436e1df6eac5009b1b9590439d74c153cb282662f65d2ab4babbc88b886e374ae4d3eab830f1a014885a08dd30848dd27a746f500c9265def3dec0"

RPROVIDES:${PN} += "cmake-kImageAnnotator-Qt5 \
kImageAnnotator-Qt5-devel"

RDEPENDS:${PN} += "libkImageAnnotator-Qt5-0"

inherit rpm
