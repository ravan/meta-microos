SUMMARY = "SpamAssassin plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via spamassassin."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.60.2"

RPM_NAME = "evolution-plugin-spamassassin-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "c37c5d3fdd81faa0791968d4124221a68c97657a64e96fdb5e1ed29fa53565620d8293d2acd422b134d6215da77e344116a24bc7020f45a5b6971d4db4f08f6e"

RPROVIDES:${PN} += "evolution-plugin-spamassassin"

RDEPENDS:${PN} += "evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
spamassassin"

inherit rpm
