SUMMARY = "LaTeX editor"
DESCRIPTION = "Texmaker is a LaTeX editor that integrates many tools \
needed to develop documents with LaTeX in just one application. \
 \
Texmaker includes unicode support, spell checking, auto-completion, \
code folding and a built-in PDF viewer with synctex support and \
continuous view mode."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "texmaker-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "4bf36a6b157e33b3262a5ef47ac7131786c9a461298a87fe9a16b33f2ecd11d11e960cc28376ec0b7bda056531db2f5e2f08c44cb4897f36291c0921b439a7d9"

RPROVIDES:${PN} += "texmaker"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-collection-latexrecommended \
web-browser \
xdg-utils"

inherit rpm
