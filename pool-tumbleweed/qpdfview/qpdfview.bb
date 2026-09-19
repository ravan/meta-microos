SUMMARY = "Tabbed document viewer in Qt"
DESCRIPTION = "qpdfview uses Poppler for PDF support, libspectre for PS support, \
DjVuLibre for DjVu support, CUPS for printing support and the Qt \
toolkit for its interface. \
 \
Current features include: \
 * Outline, properties and thumbnail panes. \
 * Scale, rotate and fit. \
 * Fullscreen and presentation views. \
 * Continuous and multiple-page layouts. \
 * Search for text. \
 * Configurable tool bars. \
 * Configurable keyboard shortcuts. \
 * Persistent per-file settings. \
 * SyncTeX support. \
 * Rudimentary annotation support. \
 * Rudimentary form support. \
 * Support for PostScript and DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-0.5.0-4.5.aarch64.rpm"
RPM_HASH = "aad787104eca3a32598c762ba311cb089b08a689d05761f94fb6bee56acdf58628e2fdd40c8639e23ab19cb0d0175bfe414d9d954f53be57701d30799979edb5"

RPROVIDES:${PN} += "qpdfview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsynctex.so.2 \
qpdfview-plugin-pdf \
qt6-sql-sqlite"

inherit rpm
