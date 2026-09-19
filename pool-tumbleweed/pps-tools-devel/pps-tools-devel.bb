SUMMARY = "Development files for the LinuxPPS API"
DESCRIPTION = "This subpackage contains a header-only C API providing a number of \
inline C functions that call out to the kernel's Pulse Per Second \
API. It is, for example, used by ntpd to interact with timing \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3+git20240314"

RPM_NAME = "pps-tools-devel-1.0.3+git20240314-1.8.aarch64.rpm"
RPM_HASH = "bd0c5f43d7fca1b32d364935049007d72b40fd76460726a1b012d08011b423db48fc12f5ac4309a317848a536efa557a943328ee52c295f6af7340ddfd7b0eb5"

RPROVIDES:${PN} += "pps-tools-devel"

RDEPENDS:${PN} += ""

inherit rpm
