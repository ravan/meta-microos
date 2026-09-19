SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "python314-firewall-2.3.2-2.1.noarch.rpm"
RPM_HASH = "0938a1d72340703ad72ec343b2865797cd767e29f9c972a264966556b7d1f81d73e3a8c4f888022c12c7e5f90855648901dc884b6424eb92bf8a8aabcf106df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-firewall"

RDEPENDS:${PN} += "python-abi \
python314-dbus-python \
python314-decorator \
python314-gobject \
typelib-GLib \
typelib-Gio \
typelib-NM"

inherit rpm
