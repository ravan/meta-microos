SUMMARY = "A LaTeX Source Editor and TeX Shell"
DESCRIPTION = "Kile is a TeX/LaTeX editor by KDE. \
 \
The main features are: \
 \
 * Compile, convert and view your document with one click. \
 * Auto-completion of (La)TeX commands. \
 * Templates and wizards make starting a new document very little work. \
 * Easy insertion of many standard tags and symbols and the option to define \
   (an arbitrary number of) user defined tags. \
 * Inverse and forward search: click in the DVI viewer and jump to the \
   corresponding LaTeX line in the editor, or jump from the editor to the \
   corresponding page in the viewer. \
 * Finding chapter or sections is very easy, Kile constructs a list of all the \
   chapter etc. in your document. You can use the list to jump to the \
   corresponding section. \
 * Collect documents that belong together into a project. \
 * Easy insertion of citations and references when using projects. \
 * Flexible and smart build system to compile your LaTeX documents. \
 * QuickPreview, preview a selected part of your document. \
 * Easy access to various help sources. \
 * Advanced editing commands."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.95git.20260802T020133~eeeb6da4"

RPM_NAME = "kile-2.9.95git.20260802T020133~eeeb6da4-1.1.aarch64.rpm"
RPM_HASH = "59d26f023dc3ba671fe5c2ddcade4e6b41f5d92468f1fd5266c933f95db8693bffe7d23706145c01ebe81cb278103f67da9beff546a34e4b7c58d8d8f48c24f1"

RPROVIDES:${PN} += "kile"

RDEPENDS:${PN} += "konsole-part \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6TextEditor.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
okular \
texlive-context \
texlive-latex \
texlive-tex-bin \
texlive-xetex"

inherit rpm
