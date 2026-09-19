SUMMARY = "The system GNU C Compiler Plugin development files"
DESCRIPTION = "The system GNU C Compiler Plugin development files."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-devel-16-1.1.aarch64.rpm"
RPM_HASH = "f372f007b12b018d522cea14f6386d6fbc5f81f3cacbe6f5dc4fffc25ba64926c7da3ff4ae7c50a6ee82e8b33aa0e3cabf81285f43a5412b71ee46de0cf11128"

RPROVIDES:${PN} += "gcc-devel"

RDEPENDS:${PN} += "gcc \
gcc16-devel"

inherit rpm
