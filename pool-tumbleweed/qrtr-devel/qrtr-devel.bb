SUMMARY = "The devel package of Qualcomm IPC Router"
DESCRIPTION = "A development pacakge that includes C header files of the qrtr shared library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "qrtr-devel-1.0-1.10.aarch64.rpm"
RPM_HASH = "499714a171d85af33d805e8ba315551059f5be83954549c75d2ec6d48e20575993fe9b76436d864540303d660fd5e8ebf6330b807f68a6f24f2061cae8e35795"

RPROVIDES:${PN} += "qrtr-devel"

RDEPENDS:${PN} += "libqrtr1"

inherit rpm
