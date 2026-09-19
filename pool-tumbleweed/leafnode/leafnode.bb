SUMMARY = "Leaf site NNTP server"
DESCRIPTION = "Leafnode is a small NNTP server for leaf sites without permanent \
connection to the internet. It supports a subset of NNTP and is able to \
automatically fetch the newsgroups the user reads regularly from the \
newsserver of the ISP and additionally offer local (site-specific) \
groups to a LAN."
LICENSE = "MIT"

PV = "2.0.0~git.1745443528.0925b70"

RPM_NAME = "leafnode-2.0.0~git.1745443528.0925b70-2.3.aarch64.rpm"
RPM_HASH = "705806c6902a5bd41840bb8036eb18d15293e6f9a729b85c8b2c4e0b0abd35f51bc7420b2aaf2acba7ea132ffd0e9b19f51e895add86e1ba503821cee991064d"

RPROVIDES:${PN} += "config-leafnode \
group-news \
group-newsadmin \
leafnode \
user-news \
user-newsadmin"

RDEPENDS:${PN} += "-group(maildrop) and postfix \
/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libpcre2-8.so.0 \
permissions \
shadow \
systemd"

inherit rpm
