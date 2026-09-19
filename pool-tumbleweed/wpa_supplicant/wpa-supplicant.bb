SUMMARY = "WPA supplicant implementation"
DESCRIPTION = "wpa_supplicant is an implementation of the WPA Supplicant component, \
i.e., the part that runs in the client stations. It implements key \
negotiation with a WPA Authenticator and it controls the roaming and \
IEEE 802.11 authentication/association of the wlan driver."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "wpa_supplicant-2.12-1.1.aarch64.rpm"
RPM_HASH = "61fc8489c5c1010f4fbdbade88640d65bfe391f8b714ce0cff655f2a7e152d2f8f0583bc85155c980814e8b081d7f93369779b178c588738f7abd73b4e351bbb"

RPROVIDES:${PN} += "config-wpa-supplicant \
wpa-supplicant"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libssl.so.3 \
logrotate"

inherit rpm
