SUMMARY = "A fullscreen, distraction-free writing program"
DESCRIPTION = "A fullscreen, distraction-free writing program. You can customize your \
environment by changing the font, colors, and background image to add \
ambiance as you type. FocusWriter features an on-the-fly updating word \
count, optional auto-save, optional daily goals, and an interface that \
hides away to allow you to focus more clearly; additionally, when you open \
the program your current work-in-progress will automatically load and \
position you at the end of your document, so that you can immediately jump \
back in."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.1"

RPM_NAME = "focuswriter-1.9.1-1.1.aarch64.rpm"
RPM_HASH = "c9c66771daff311f2ae3f322d870d52a20f4d5b57117309f2272175c2b29b4c41b920052183985387a31ee3052ff45c3f5bbbc0f7daa636d44fdb02db16bb7fb"

RPROVIDES:${PN} += "focuswriter"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-desktop-files"

inherit rpm
