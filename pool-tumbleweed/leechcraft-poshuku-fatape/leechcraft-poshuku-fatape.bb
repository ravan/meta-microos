SUMMARY = "LeechCraft Poshuku Greasemonkey Module"
DESCRIPTION = "This package provides a Greasemonkey script plugin for LeechCraft Poshuku. \
These scripts could be used for \
adding new features to web pages (for example, embedding price comparisons \
within shopping sites), fixing rendering bugs, combining data from multiple \
webpages, and numerous other purposes. \
 \
This plugin supports almost all of the GreaseMonkey API and is compatible \
with most userscripts present 'in the wild'. \
 \
FatApe usage is documented on the corresponding user guide page."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-fatape-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "cd215c8d06171aeca055635b678081666ca56a87cd843cad67f5091f4bada057359d2c7114171461d0a42e566083ad40ecd640a53a9a4c7b3b0c20ed526a2858"

RPROVIDES:${PN} += "leechcraft-poshuku-fatape \
libleechcraft-poshuku-fatape.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
