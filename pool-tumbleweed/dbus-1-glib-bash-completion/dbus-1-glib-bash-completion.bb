SUMMARY = "Bash-completion package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains bash-completion support for dbus-1-glib."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.114"

RPM_NAME = "dbus-1-glib-bash-completion-0.114-1.3.aarch64.rpm"
RPM_HASH = "a1f398535b945c80042bb4e9cac39004b368ff9147971c10d8dac77cc5bf77bfee51dc9b5fe107f38c598ded75a236010908b5ee502c79d176c794df77766a40"

RPROVIDES:${PN} += "dbus-1-glib-/etc/bash-completion.d/dbus-bash-completion.sh \
dbus-1-glib-bash-completion"

RDEPENDS:${PN} += "dbus-1-glib-tool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
