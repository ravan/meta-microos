SUMMARY = "GNOME system keyring plugin for Purple"
DESCRIPTION = "After the plugin is enabled, whenever an account with a pidgin-stored \
password signs on, its password will automatically be saved to the \
keyring and removed from the plaintext accounts.xml file."
LICENSE = "GPL-2.0+"

PV = "2.0"

RPM_NAME = "libpurple-plugin-gnome-keyring-2.0-2.8.aarch64.rpm"
RPM_HASH = "378e101a365430969419e6d8973a70fc7270a3d278d12c12bb77c729aa9af9f59b290cf5573d55e64ba3374a19fb308c93a334704781d684536c3cdd611c32dc"

RPROVIDES:${PN} += "libpurple-plugin-gnome-keyring"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
