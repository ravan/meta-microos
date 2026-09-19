SUMMARY = "KDE PIM calendaring support library"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "calendarsupport-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "93f735911fd7c29a3df243f0241b96e3257fbb87741ddb52b5a2bfbdb49bc0eaacd1af9ed2829513b6b6f3348932e6dd254ed45121171df26ca76e2a9515b6df"

RPROVIDES:${PN} += "calendarsupport"

RDEPENDS:${PN} += ""

inherit rpm
