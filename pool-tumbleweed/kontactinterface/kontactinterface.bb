SUMMARY = "KDE PIM Libraries: Interface to Contacts"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kontactinterface-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3d7fac553306fa98837066ad62b118bbffb0089e1e744d084569ff3ed6af9db0eec20c766bf15a4a7f8c611567ebf0df09b42d689045b00effb2debdf4340362"

RPROVIDES:${PN} += "kontactinterface"

RDEPENDS:${PN} += ""

inherit rpm
