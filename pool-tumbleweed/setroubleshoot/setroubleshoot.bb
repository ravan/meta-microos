SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "setroubleshoot GUI. Application that allows you to view setroubleshoot-server \
messages. \
Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.37"

RPM_NAME = "setroubleshoot-3.3.37-1.1.aarch64.rpm"
RPM_HASH = "00a364e2aba63d637f5ce1ff360f4a533fccb6758c4d4530f7e5bf524832406b7de8d4030e165f35d65c0e15a474e8eb504a30bc496e977a1c0923868d17f4e8"

RPROVIDES:${PN} += "config-setroubleshoot \
setroubleshoot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
desktop-file-utils \
gtk3 \
libnotify \
python-abi \
python3-dasbus \
python3-gobject \
setroubleshoot-server \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
xdg-utils"

inherit rpm
