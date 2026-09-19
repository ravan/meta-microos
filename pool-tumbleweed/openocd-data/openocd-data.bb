SUMMARY = "Hardware Scripts for OpenOCD"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices. \
This package provides hardware description files and documentation."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-data-0.12.0-2.16.noarch.rpm"
RPM_HASH = "9f6895eece9cc53fb8ff5421f98de7272ac36354eae43dc0611eecf7ff085f23d49a5fb1903868f15a668f3a7a54687bb4e81221d339e8ee74f95923dc3dc921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openocd-data"

RDEPENDS:${PN} += "openocd"

inherit rpm
