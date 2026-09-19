SUMMARY = "Note taking and management application"
DESCRIPTION = "KleverNotes allows you to create and preview a Markdown note while giving you \
the freedom to customize the preview from settings or using a CSS theme. \
You can organize your notes however you want with a combination of categories \
and groups, which will be directly reflected on your system in the hierarchy of \
your KleverNotes storage folders. Simply choose your storage location and \
you're ready to write! \
 \
You can print your notes, add small sketches and even create specific tasks for \
each of them. \
 \
Notes are saved as Markdown files in your KleverNotes storage for easy access. \
They support the entire CommonMark specification with extensive syntax. \
KleverNotes also introduces a small collection of opt-in “plugins” to extend \
basic markdown features, such as: code highlighting, note linking, quick \
emoji, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "klevernotes-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "01429f11de7dd945f656d625b0e3aa942f4fe396a7514ce3179ca0cc7788a3ca3108b045016bef10d2eb2a3d36b4cba0c6f5e3f68325c7c6bcde57bcb69744e8"

RPROVIDES:${PN} += "klevernotes"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
