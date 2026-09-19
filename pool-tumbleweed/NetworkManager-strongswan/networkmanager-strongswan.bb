SUMMARY = "NetworkManager VPN support for strongSwan"
DESCRIPTION = "NetworkManager-strongswan provides VPN support to NetworkManager for \
strongSwan."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.5"

RPM_NAME = "NetworkManager-strongswan-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "338de6ca5c49399742dae4307c89713e7273d785cb52acc94bbf756c81b52487082b20166ae333df70cf7d285b498fb2fdc987d263cd9da7ec2489e1da791e8a"

RPROVIDES:${PN} += "NetworkManager-strongswan \
libnm-vpn-plugin-strongswan.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
strongswan-nm"

inherit rpm
