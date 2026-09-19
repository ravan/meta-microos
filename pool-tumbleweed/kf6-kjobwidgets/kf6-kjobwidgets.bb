SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kjobwidgets-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2c6f4400b6e8cd983dbe0d7da1f083da2a3817aa5ccd1822140eeccb0b935bc6bb80fbc1ec671c09b055fd76390739c58152ab14e7c96191fff5f128959abff3"

RPROVIDES:${PN} += "kf6-kjobwidgets"

RDEPENDS:${PN} += ""

inherit rpm
