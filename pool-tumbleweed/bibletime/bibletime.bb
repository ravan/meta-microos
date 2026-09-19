SUMMARY = "A Bible study tool"
DESCRIPTION = "BibleTime is a Bible study program. \
 \
The software uses the SWORD programming library to work with over 200 free \
Bible texts, commentaries, dictionaries and books provided by the Crosswire \
Bible Society. \
 \
BibleTime provides easy handling of digitalized texts (Bibles, commentaries and \
lexicons) and powerful features to work with these texts (search in texts, \
write own notes, save, print etc.)."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "bibletime-3.2.0-2.6.aarch64.rpm"
RPM_HASH = "9284f6ae6497b1bdbb0a39ffb21c017bfb2953eed9b63c0d81da404f152128f0404e9dc7de924e2df99271694c9ef5e27dbb1228008d49b336e7fe3c34a1c4bc"

RPROVIDES:${PN} += "bibletime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libclucene-core.so.1 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsword-1.9.0.so"

inherit rpm
