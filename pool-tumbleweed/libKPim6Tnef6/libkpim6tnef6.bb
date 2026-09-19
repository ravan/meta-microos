SUMMARY = "TNEF Support"
DESCRIPTION = "Library to work with TNEF Email Attachments."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Tnef6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "bdfc9fdb3457b4b779e44585bcf87a8c4964e8b94a68d9761cd8a2863130fe683685a6c655c768238db6c5ea0e4350cea41318fe0fcbd70ed3db89d0249c05f7"

RPROVIDES:${PN} += "libKPim6Tnef.so.6 \
libKPim6Tnef6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktnef-debug-categories \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Contacts.so.6 \
libKF6I18n.so.6 \
libKPim6CalendarUtils.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
