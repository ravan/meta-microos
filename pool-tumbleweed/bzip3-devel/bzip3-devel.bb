SUMMARY = "Development files for libbzip3"
DESCRIPTION = "Development headers and library files for BZip3."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "bzip3-devel-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "6bf8a68ac7b4eb255330c3ba7990f8401dbe25858c5ba57abc199550bf25e01b22f0d629e727f89ec57c77eab9e33b372f9223cb4a21da21b52c8f05816a917c"

RPROVIDES:${PN} += "bzip3-devel \
pkgconfig-bzip3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbzip3-1"

inherit rpm
