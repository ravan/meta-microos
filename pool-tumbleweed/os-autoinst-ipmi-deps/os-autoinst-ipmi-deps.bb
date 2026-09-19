SUMMARY = "Convenience package providing os-autoinst + ipmi worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + ipmi worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788768889.879c500"

RPM_NAME = "os-autoinst-ipmi-deps-5.1788768889.879c500-1.1.aarch64.rpm"
RPM_HASH = "d8498aba3453878b6ff82f208d74cb36a0c06020dfcf5e3f1c30753386a87c1343eb467ce92055b4d7bc54b2772f40e7a06a2b5af0a7ab6962129387d95bd3af"

RPROVIDES:${PN} += "os-autoinst-ipmi-deps"

RDEPENDS:${PN} += "ipmitool \
os-autoinst"

inherit rpm
