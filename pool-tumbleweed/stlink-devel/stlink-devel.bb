SUMMARY = "Development files for stlink package"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "stlink-devel-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "9eb0f77b8e82013c438ad6658b22b330a8201d2f7fc8642ee7283141c786f19876cd233355fe9fedc7efb572dce1d9f7cac2af1cc810a54b0c930c8f039a9876"

RPROVIDES:${PN} += "stlink-devel"

RDEPENDS:${PN} += "libstlink1"

inherit rpm
