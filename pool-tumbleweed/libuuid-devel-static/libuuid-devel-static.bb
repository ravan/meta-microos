SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.42.2"

RPM_NAME = "libuuid-devel-static-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "3a27aaca7b80ecf6c41c0c10993f1072d941ccbc95a34dac2cbc5feb05ee9ddaa321b45ca6f9e1a19d03baae18136c9a3ce0910c14614d8217bcac54c635e707"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
