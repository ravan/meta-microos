SUMMARY = "Default overlay for warewulf"
DESCRIPTION = "Includes the default overlays so that they can be updated seprately."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-overlay-4.7.0-4.1.aarch64.rpm"
RPM_HASH = "bcdd9b09460ef633d8f3caab3d5b4cd6f74c1f176260a1eabfcf80565877ff18d3fa57c09f1521bd837e09e4e314a60e3cdaa612b0d817f5b4fbea705ac78e99"

RPROVIDES:${PN} += "warewulf4-overlay"

RDEPENDS:${PN} += "/usr/bin/sh \
warewulf4"

inherit rpm
