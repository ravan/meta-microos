SUMMARY = "HTML documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in HTML format."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "boost1_91_0-doc-html-1.91.0-4.1.noarch.rpm"
RPM_HASH = "4b22de910485da4d72eec46351d27c402c6beda6e40696be30b7780b5eb976e50d3779d1daf6065883f2e35fc1d9ee9ba64e44d9770ee307df5db551d0150dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1-91-0-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
