SUMMARY = "Development files for libaiff"
DESCRIPTION = "LibAiff is a library with support for reading and writing Audio Interchange \
File Format (AIFF) files. \
 \
This package contains files required for development with libaiff."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "libaiff-devel-6.0-1.6.aarch64.rpm"
RPM_HASH = "839a7c79f54548ed8e4c38eb30b9c1b343a576dffa67632b407e4fa6d9f14610dd38359273ce85da34d31b41e2269bdf3a05c61c567b271d1c574bef9f313671"

RPROVIDES:${PN} += "libaiff-devel"

RDEPENDS:${PN} += "libaiff2"

inherit rpm
