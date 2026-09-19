SUMMARY = "Akonadi calendar integration"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-calendar-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "19f5ede2e18451d56cdbdaefdd181adb9a92bd4547b7e14eb22685c6da49f3b5405c75554b7ee9802626fedf1537cbc172720c550e95e2cbf48831dbf59aa736"

RPROVIDES:${PN} += "akonadi-calendar"

RDEPENDS:${PN} += ""

inherit rpm
