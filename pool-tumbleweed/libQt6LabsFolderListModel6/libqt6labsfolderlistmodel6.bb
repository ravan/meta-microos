SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsFolderListModel6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "5112d542c8032d9d3c634be884d8601ac770947c207be0e065a613a573049f380cc81bb6f7862bf41ae1b17056bec3a3118e8423be35b4394aced5cb87eabfd3"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
