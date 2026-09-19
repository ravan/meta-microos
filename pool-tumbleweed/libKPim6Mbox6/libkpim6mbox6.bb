SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package provides the mailbox functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Mbox6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c1e2ecfe7f9c6a4afe0ee6f875ef5943f308111b68d02cddf99f5b1e3379422e702800a31f756fe8b0e55f1dff98c13910298176bff66b5512c3535c1707ae89"

RPROVIDES:${PN} += "libKPim6Mbox.so.6 \
libKPim6Mbox6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmbox \
ld-linux-aarch64.so.1 \
libKF6Mime.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
