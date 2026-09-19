SUMMARY = "A C# client implementation for Desktop Notifications"
DESCRIPTION = "notify-sharp is a C# client implementation for Desktop Notifications, \
i.e. notification-daemon. It is inspired by the libnotify API. \
 \
Desktop Notifications provide a standard way of doing passive pop-up \
notifications on the Linux desktop. These are designed to notify the \
user of something without interrupting their work with a dialog box \
that they must close. Passive popups can automatically disappear after \
a short period of time."
LICENSE = "MIT"

PV = "0.4.0.r3032"

RPM_NAME = "notify-sharp-0.4.0.r3032-12.4.noarch.rpm"
RPM_HASH = "7e785574856ce088ace47b1fbaaaec2a1390a4dde62978b1fe83b702eec84abf2ffa5e9b21896d5fe6ae2bef7b1547313af619c3178c5a4d24903a98daa94c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-notify-sharp \
notify-sharp"

RDEPENDS:${PN} += "mono-dbus-sharp \
mono-dbus-sharp-glib \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib"

inherit rpm
