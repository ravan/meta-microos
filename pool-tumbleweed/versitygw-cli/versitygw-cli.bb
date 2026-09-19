SUMMARY = "Binary for versitygw, usable to connect to remote instances"
DESCRIPTION = "This package only installs the versitygw binary to be able to connect to remote \
VersityGW instances."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "versitygw-cli-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "b4c2d6764c7eff873a538ba9101383ccbca4bb82c4f0eaceb95647f8ef622b5db31a03a092d415f35780f6adfd2d1bd437a5fb67defe6bdc02c3456a50e82a8f"

RPROVIDES:${PN} += "versitygw-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
