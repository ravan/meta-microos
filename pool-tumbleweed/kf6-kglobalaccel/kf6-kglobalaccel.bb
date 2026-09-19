SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kglobalaccel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4cb5bedb28a8635254555941aab018e21ad94a973cec1f5ab2a0645c67169d0bf1fec35787a0f096fd136596d2482e75dcbc931c65924b4d06ea5985adeab221"

RPROVIDES:${PN} += "kf6-kglobalaccel"

RDEPENDS:${PN} += ""

inherit rpm
