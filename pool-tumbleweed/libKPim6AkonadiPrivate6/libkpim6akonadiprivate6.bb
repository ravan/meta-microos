SUMMARY = "Akonadi Private Server library"
DESCRIPTION = "This package includes the Private Akonadi library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiPrivate6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b95d3f5eae53db432e334d6729cadccee3a87ad6dba0d9d579e41f630a50707167ebe354fc15e38f6c4e18858dd621aa848aa549059585130c7f504898436e3f"

RPROVIDES:${PN} += "libKPim6AkonadiPrivate.so.6 \
libKPim6AkonadiPrivate6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6"

inherit rpm
