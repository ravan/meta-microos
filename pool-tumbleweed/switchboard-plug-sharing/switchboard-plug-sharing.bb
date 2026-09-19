SUMMARY = "Configure the sharing of system services"
DESCRIPTION = "Switchboard plug for controlling media sharing."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-plug-sharing-8.0.3-1.4.aarch64.rpm"
RPM_HASH = "deb32896d2560225e91196a8ad524e52b2cfd4175529899da45bd48c0852bd71d854d6dc614059165219d908dc410a5d2b1ad8b561be47f2ecee59bff706aaf3"

RPROVIDES:${PN} += "libio.elementary.settings.sharing.so \
switchboard-plug-sharing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
