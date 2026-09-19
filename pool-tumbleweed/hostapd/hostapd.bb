SUMMARY = "Daemon for running a WPA capable Access Point"
DESCRIPTION = "hostapd is a user space daemon for access point and authentication \
servers. It implements IEEE 802.11 access point management, IEEE \
802.1X/WPA/WPA2/EAP Authenticators, RADIUS client, EAP server, and \
RADIUS authentication server. Currently, hostapd supports HostAP, \
madwifi, and prism54 drivers. It also supports wired IEEE 802.1X \
authentication via any ethernet driver."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.11"

RPM_NAME = "hostapd-2.11-5.1.aarch64.rpm"
RPM_HASH = "1fa5ad250a1b1fffaf773b844224f4494dd3e1ab23b2099c0dd289f70b04d665c2f72c0de4eae1dc10f9436ff16b2cf97ae585dc8a5571e77db6e9f8f2197be3"

RPROVIDES:${PN} += "config-hostapd \
hostapd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libsqlite3.so.0 \
libssl.so.3 \
systemd"

inherit rpm
