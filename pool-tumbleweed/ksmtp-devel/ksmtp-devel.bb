SUMMARY = "Development files for KSMTP"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the KSMTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "ksmtp-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ba77addd47da2aa3559c109c3a2256dd10387455022b6f4f100a9dca298335f6f0c872adcb70c64baf5c054dc1b698d69e8dfd849414e0b79664a885dca3b2f6"

RPROVIDES:${PN} += "cmake-KPim6SMTP \
ksmtp-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
libKPim6SMTP6"

inherit rpm
