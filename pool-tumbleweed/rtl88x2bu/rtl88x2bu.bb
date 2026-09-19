SUMMARY = "Kernel driver for Realtek 88x2bu wifi cards"
DESCRIPTION = "Kernel driver for Realtek 88x2bu wifi cards \
 \
The sources were obtained from https://github.com/cilynx/rtl88x2bu, which adapts the official driver \
released by Realtek to build on recent kernels."
LICENSE = "GPL-2.0-only"

PV = "5.8.7.1+git20260818.04ed700"

RPM_NAME = "rtl88x2bu-5.8.7.1+git20260818.04ed700-2.1.aarch64.rpm"
RPM_HASH = "50ab639485f75806106f488eb3f261a34408da50605eb700f3a4307b0a822f53f7d23e9f5a7466426c1f8c261ebeff29dcfd1dec4f2b64e880a5fcdd88df99f9"

RPROVIDES:${PN} += "rtl88x2bu"

RDEPENDS:${PN} += ""

inherit rpm
