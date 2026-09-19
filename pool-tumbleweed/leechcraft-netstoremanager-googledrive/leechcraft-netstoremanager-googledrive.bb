SUMMARY = "LeechCraft Google Drive storage Module"
DESCRIPTION = "This package provides a Google Drive subplugin for Leechcraft NetStoreManager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-netstoremanager-googledrive-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "62e4bce92525965ebb87491006ef591b979e7febfd6df20c401af663581ab1bf923c1e265271e8e3a0bafffd0c544cb0198af9a0403237a143f65e275d4c7f84"

RPROVIDES:${PN} += "leechcraft-netstoremanager-googledrive \
leechcraft-netstoremanager-subplugin \
libleechcraft-netstoremanager-googledrive.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-netstoremanager \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
