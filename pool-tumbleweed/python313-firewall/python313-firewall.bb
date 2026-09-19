SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "python313-firewall-2.3.2-2.1.noarch.rpm"
RPM_HASH = "f2d4c43cc126d02b5c79a3faf2c55a1b221d44ae30fb7dd545c0264be26e5a61fd21d0a898620bee5f1a1a073bdfb2a9e2b2f81c620a158cddd5e0d0c391a783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-firewall \
python313-firewall"

RDEPENDS:${PN} += "python-abi \
python313-dbus-python \
python313-decorator \
python313-gobject \
typelib-GLib \
typelib-Gio \
typelib-NM"

inherit rpm
