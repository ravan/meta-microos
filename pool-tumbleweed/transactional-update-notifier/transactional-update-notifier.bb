SUMMARY = "A notifier for systems using transactional updates"
DESCRIPTION = "Add notifications, via Desktop Bus (D-Bus), about transactional updates for \
all users currently logged in in a graphical session. Being even possible \
for it to be used as a reboot method through transactional-updates.conf(5)."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "transactional-update-notifier-1.1.2-2.7.aarch64.rpm"
RPM_HASH = "33a07404f7cf0bdb6b3fd603919af05fdc71f5d4822389a479118169d342a526bf0ab0b84daaac779c0ce6b58f201b08a59c4c634bbf212378d121441cd47aae"

RPROVIDES:${PN} += "transactional-update-notifier"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-service \
libc.so.6"

inherit rpm
