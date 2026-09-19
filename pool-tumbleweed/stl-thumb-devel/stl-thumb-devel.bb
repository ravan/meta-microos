SUMMARY = "Files needed for stl-thumb development"
DESCRIPTION = "Files needed to develop applications for the stl-thumb."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-devel-0.5.0~0-3.17.aarch64.rpm"
RPM_HASH = "1ea2062ad98ec916b610e8565b405e0e6849d99fb3c67ddd28e5344dc363dc6e02b196ad99eb9e66c9ad7e6e140d0060d89b3e050e808fb71399e869ce8c821c"

RPROVIDES:${PN} += "stl-thumb-devel"

RDEPENDS:${PN} += "libstl-thumb"

inherit rpm
