SUMMARY = "C++ development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
Development files for the C++ interface to the OpenWSMAN client library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "libwsman_clientpp-devel-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "701a8ff9cd7d70d6e74af9b06f580abfe2ba6b513aa38f085f0d42edcbdb033fbb7410195fb0846d0e6c6d3cfcd5ba497e15078d763d06c83700ea426959fe7f"

RPROVIDES:${PN} += "libwsman-clientpp-devel"

RDEPENDS:${PN} += "libwsman-clientpp1 \
libwsman-devel"

inherit rpm
