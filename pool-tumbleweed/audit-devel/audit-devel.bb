SUMMARY = "Header files for libaudit"
DESCRIPTION = "The audit-devel package contains the header files \
needed for developing applications that need to use the audit framework \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "audit-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "9adb9806669ebd3e249f7aeb261fb397dc3bb96b1e55762ef4c10fdbb841193d0aee014fb20bb9660ad1c1c1240c194a3b657bf8dddddbbb9dc987765637da13"

RPROVIDES:${PN} += "audit-devel \
pkgconfig-audit \
pkgconfig-auparse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudit1 \
libauparse0"

inherit rpm
