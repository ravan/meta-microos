SUMMARY = "The BibTeX (Latex) bibliography manager by KDE"
DESCRIPTION = "KBibTeX is a BibTeX editor by KDE to edit bibliographies used with \
LaTeX. Features include comfortable input masks, starting web queries \
(e. g. Google or PubMed) and exporting to PDF, PostScript, RTF and \
XML/HTML. As KBibTeX is using KDE's KParts technology, KBibTeX can be \
embedded into Kile or Konqueror."
LICENSE = "GPL-2.0-only"

PV = "0.10.50git.20260801T020758~7ee937e1"

RPM_NAME = "kbibtex-0.10.50git.20260801T020758~7ee937e1-1.1.aarch64.rpm"
RPM_HASH = "021a6ba76538dff19f9306a51e96219533ac9a08f1e03000fce1f00dc289a4bb37a967ec1ebefb227f76cedff125e46b65fdf21c4bd0cba989df3edc5c1d7b81"

RPROVIDES:${PN} += "kbibtex \
libkbibtexconfig.so.0 \
libkbibtexdata.so.0 \
libkbibtexglobal.so.0 \
libkbibtexgui.so.0 \
libkbibtexio.so.0 \
libkbibtexnetworking.so.0 \
libkbibtexprocessing.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
