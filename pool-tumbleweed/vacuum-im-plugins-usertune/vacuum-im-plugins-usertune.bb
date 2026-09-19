SUMMARY = "Vacuum-IM User Tune Handler plugin"
DESCRIPTION = "This plugin provides support to XEP-0118: defines a payload format for \
communicating information about music to which a user is listening, including \
the title, track number, collection, performer, composer, length, and user \
rating. The payload format is typically transported using the personal eventing \
protocol, a profile of XMPP publish-subscribe specified in XEP-0163."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "vacuum-im-plugins-usertune-1.1.3-1.33.aarch64.rpm"
RPM_HASH = "34062a0bbdfaf42802cc2da16e98b2e8cd6729d139981f2d039640817da256035629d4c09e1d26fca8b5e1caae6e720f21e4c6b993caf104a4c296e6de439035"

RPROVIDES:${PN} += "libusertune.so \
vacuum-im-plugins-usertune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
