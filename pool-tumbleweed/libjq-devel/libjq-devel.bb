SUMMARY = "Development files for jq"
DESCRIPTION = "Development files (headers and libraries for jq)."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.8.2"

RPM_NAME = "libjq-devel-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "253ea82f50db6d8bca54d3707412f02c6794540486696f97d4e412430e9a55dec70999700436a535a0634f276f809fe922fc8fbdbde9e5a0ea71f6dc5a237d6f"

RPROVIDES:${PN} += "libjq-devel \
pkgconfig-libjq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjq1"

inherit rpm
