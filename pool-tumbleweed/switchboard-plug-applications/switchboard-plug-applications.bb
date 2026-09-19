SUMMARY = "Application configuration management"
DESCRIPTION = "Application configuration management. \
The applications plug is a section in the Switchboard (System Settings) that \
allows the user to manage application settings."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.0"

RPM_NAME = "switchboard-plug-applications-8.3.0-1.3.aarch64.rpm"
RPM_HASH = "2de61d60ede3f8ecafee4555dee875f0d2fda9c6744cfcf8d3d265240f14d57fec845d082e47b9318375bedb4438c91bff26094c42e627bb614f2c2761b52ce4"

RPROVIDES:${PN} += "libapplications.so \
switchboard-plug-applications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libflatpak.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
