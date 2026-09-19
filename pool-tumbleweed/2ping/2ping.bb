SUMMARY = "Bi-directional ping utility"
DESCRIPTION = "2ping is a bi-directional ping utility. It uses 3-way pings (akin to TCP SYN, \
SYN/ACK, ACK) and after-the-fact state comparison between a 2ping listener and \
a 2ping client to determine which direction packet loss occurs."
LICENSE = "MPL-2.0"

PV = "4.6.1"

RPM_NAME = "2ping-4.6.1-1.2.noarch.rpm"
RPM_HASH = "f395a1431404ec242516ccf6a583843a72e720ba5f50a29b411a3e1e7ba005fb8a24498ec38ef86d69d51b7ffee476f1c2bb3af891d1237b3cb338fd50a9399a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "2ping \
python3.13dist-2ping \
python3dist-2ping"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
systemd"

inherit rpm
