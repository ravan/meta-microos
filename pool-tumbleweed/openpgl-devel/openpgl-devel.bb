SUMMARY = "Development files for the Open Path Guiding library"
DESCRIPTION = "Development files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "openpgl-devel-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "af6c4cf742cfb2b4c5ab63d9a12b4b2282cf42b46051d9e663e0d275526b16b165eccee885eac942106eaa8a7b21fb875590a87b939693489f54b14c59e9940e"

RPROVIDES:${PN} += "cmake-openpgl \
openpgl-devel"

RDEPENDS:${PN} += "libopenpgl0"

inherit rpm
