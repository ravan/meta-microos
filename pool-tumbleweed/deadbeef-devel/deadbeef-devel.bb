SUMMARY = "Development files for deadbeef"
DESCRIPTION = "This package provides headers for DeaDBeeF plugins development."
LICENSE = "Zlib"

PV = "1.10.2"

RPM_NAME = "deadbeef-devel-1.10.2-3.3.noarch.rpm"
RPM_HASH = "f1f026829532e3949179a868aa5790ac5b63bc1c6b4a7903d0403a1c6516952de7c7f6b1b52c2ff9f8ed9aa0773754eafaa66ef309e96c5dd9e085e0639ea810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deadbeef-devel"

RDEPENDS:${PN} += "deadbeef"

inherit rpm
