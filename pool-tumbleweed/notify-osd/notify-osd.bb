SUMMARY = "Streamlined Notification Daemon"
DESCRIPTION = "This notification daemon is an alternative to the \
mate-notification-daemon package. It follows the freedesktop \
notification specification and introduces some new policies for \
streamlining the user-experience by discouraging the use of actions \
and timeouts."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.35~bzr20191129"

RPM_NAME = "notify-osd-0.9.35~bzr20191129-4.5.aarch64.rpm"
RPM_HASH = "fe0aaab44b89f9fed31249befeb5109a914319728c45be3110b857bf9e8d5593bd5e786512287e15381506b54875935eb9899597376143f92c509c84a9d0b8a1"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
notify-osd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libwnck-3.so.0"

inherit rpm
