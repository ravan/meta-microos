SUMMARY = "LeechCraft File Uploader Module"
DESCRIPTION = "This package provides a file uploader plugin for LeechCraft \
with which files can be uploaded to accountless filebin services."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-zalil-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "da75609878baf1275c33dabe78a974109ee9bc4aa050cfc40255e87ada88967120efaf915769b4ac63408fcd8838291fb6d7797552bafb7d2e0d6523cd52a078"

RPROVIDES:${PN} += "leechcraft-zalil \
libleechcraft-zalil.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
