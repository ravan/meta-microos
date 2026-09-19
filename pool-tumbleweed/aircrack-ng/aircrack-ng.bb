SUMMARY = "A set of tools for auditing wireless networks"
DESCRIPTION = "Aircrack-ng is a suite of tools to assess network security. \
The main capabilities of aircrack-ng is to monitor, attack, test and crack WiFi networks \
for auditing purposes."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-1.7-5.5.aarch64.rpm"
RPM_HASH = "0c3e37d22f7becea5ac91383edf3b5972f2e36dc0333316c2bb46bf226c97975c95ff028fce488b91a4088f6980154f0ee310a59b22db3378389edf368fcea26"

RPROVIDES:${PN} += "aircrack-ng \
python3.13dist-airdrop-ng \
python3.13dist-airgraph-ng \
python3dist-airdrop-ng \
python3dist-airgraph-ng"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ethtool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libhwloc.so.15 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpcap.so.1 \
libpcre2-8.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
python-abi \
python3-graphviz \
wireless-tools"

inherit rpm
