SUMMARY = "Tor Proxy Plugin for DNF"
DESCRIPTION = "Tor proxy plugin forces DNF to use Tor to download packages. It makes sure that \
Tor is working and avoids leaking the hostname by using the proper SOCKS5 interface."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugin-torproxy-4.1.2-1.8.noarch.rpm"
RPM_HASH = "7b01a705fa2b5298ab14cce7a5741aec698e60c62f466642e54110be31002d2d0fa2d8d1bbac43d4f6640a0cb256671b7530bed6eac708762e1240107d517bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-torproxy \
dnf-plugin-torproxy \
dnf-plugins-extras-torproxy \
python3-dnf-plugin-torproxy \
python3-dnf-plugins-extras-torproxy"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-pycurl"

inherit rpm
