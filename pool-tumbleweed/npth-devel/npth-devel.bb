SUMMARY = "Development files for the GNU New Portable Threads library"
DESCRIPTION = "nPth is a non-preemptive threads implementation using an API \
similar to the one in GNU Pth. \
 \
This subpackage contains the headers for npth."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "npth-devel-1.8-2.6.aarch64.rpm"
RPM_HASH = "9ef99911fbca971e9d5a79b6368681dbebb1f128efb685100b60a0c5215b1931ad8bff1a2df31ebca39b0159fcff6e9264ef0a515ba6616633c24125e8799acd"

RPROVIDES:${PN} += "npth-devel \
pkgconfig-npth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnpth0"

inherit rpm
