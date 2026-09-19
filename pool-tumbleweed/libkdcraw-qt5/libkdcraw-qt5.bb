SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "25.12.3"

RPM_NAME = "libkdcraw-qt5-25.12.3-1.6.aarch64.rpm"
RPM_HASH = "26ec034bc403383d43d094d0116d1f621d2abb02ff9cae376a55ff527b76064e2cae3fc197fffd3a4bc9e94b6880a80d0b51234f53c8db4b91095d1b588b85d3"

RPROVIDES:${PN} += "libkdcraw \
libkdcraw-kf5 \
libkdcraw-qt5"

RDEPENDS:${PN} += ""

inherit rpm
