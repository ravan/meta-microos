SUMMARY = "Online Accounts plug for Switchboard"
DESCRIPTION = "This plug allow you to enable online accounts sync."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-onlineaccounts-8.0.2-1.5.aarch64.rpm"
RPM_HASH = "20721507c74c0e714b19989b42937a1057970977454ac46fd60882731b799bf7d704359181bf154d8e27acaee23f22d6b33f9497f71baec6dabaa7922b110dd3"

RPROVIDES:${PN} += "libonlineaccounts.so \
switchboard-plug-onlineaccounts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
