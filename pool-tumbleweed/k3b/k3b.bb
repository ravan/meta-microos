SUMMARY = "CD/DVD/Blu-ray Burning Application by KDE"
DESCRIPTION = "Featuring a graphical interface, k3b provides various \
options for burning a CD, DVD, or BD (Blu-ray disc). Various types of \
projects are supported, including audio and data, video \
projects for DVD and VCD, as well as multi-session and mixed-mode discs. k3b \
has the ability to erase re-writeable media, and can perform more \
complicated tasks such as audiovisual encoding and decoding."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "k3b-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5f56ac989b11f408569256cf7a85053fb8d3d6f3e64564d3eab6f568ae108881da57a38e34946449a2cc91fe2116502f24652b844c4cdad0f57264803266dafe"

RPROVIDES:${PN} += "k3b \
libk3bdevice.so.8 \
libk3blib.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/cdrdao \
/usr/bin/cdrecord \
/usr/bin/mkisofs \
/usr/bin/readcd \
dvd+rw-tools \
lame \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libKCddb6.so.5 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdvdread.so.8 \
libm.so.6 \
libmad.so.0 \
libmp3lame.so.0 \
libmpcdec.so.6 \
libogg.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libtag.so.2 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
udisks2"

inherit rpm
