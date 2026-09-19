SUMMARY = "Allegro JACK (Jack Audio Connection Kit) plugin"
DESCRIPTION = "This package contains a plugin for Allegro which enables Allegro to playback \
sound through JACK (Jack Audio Connection Kit)."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-jack-plugin-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "88cc7b7c8d5fbb43680b8214f3f0a8938adceca366158c569fd340b439183a352e27c28a87ce56ce6d405a85fda74579113083b0ee7d6c153a03285ab3dbf60b"

RPROVIDES:${PN} += "allegro44-jack-plugin"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libjack.so.0"

inherit rpm
