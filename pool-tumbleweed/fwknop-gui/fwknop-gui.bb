SUMMARY = "FireWall KNock OPerator Graphical User Interface"
DESCRIPTION = "The FireWall KNock OPerator implements an authorization scheme called \
Single Packet Authorization (SPA), based on Netfilter and libpcap. \
 \
Its main application is to protect services such as OpenSSH with an \
additional layer of security in order to make the exploitation of \
vulnerabilities (both 0-day and unpatched code) much more difficult. \
 \
Fwknop GUI is a graphical user interface integrated with an Fwknop \
client that provides the ability to send SPA packets to a remote \
Fwknop server, as well as a front-end for creating and managing client \
configurations for multiple Fwknop servers. \
 \
It supports exporting saved configuration data to a QR code format \
readable by the Android client, as well as to the .fwknoprc format \
readable by the command line client."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "fwknop-gui-1.3.1-2.13.aarch64.rpm"
RPM_HASH = "4cee3e744027e1bd93f1596d348a65bb9570ff00bd73c274880b95cb5bf364ac4e6a9440cdae9c67a09af82a5acffa3d21e24e96d1ace6eb009c1c699a127d1d"

RPROVIDES:${PN} += "fwknop-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfko.so.3 \
libgcc-s.so.1 \
libgpgme.so.45 \
libqrencode.so.4 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
