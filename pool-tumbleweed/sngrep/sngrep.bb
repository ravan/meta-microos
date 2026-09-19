SUMMARY = "Ncurses SIP Messages flow viewer"
DESCRIPTION = "sngrep displays SIP Messages grouped by Call-Id into flow \
diagrams. It can be used as an offline pcap viewer or online \
capture using libpcap functions. \
 \
It supports SIP UDP and TCP transports (when each message is \
delivered in one packet)."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.4"

RPM_NAME = "sngrep-1.8.4-2.1.aarch64.rpm"
RPM_HASH = "a23661cf8efad3057851500cfe1f094dc99ba80a914a0e7eda23f49985120212cc10ae3849cef474cf09b0277102ef6a8cf5d58ea89d8ce947eac8ccdc4f50db"

RPROVIDES:${PN} += "config-sngrep \
sngrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libformw.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libpcap.so.1 \
libpcre2-8.so.0 \
libssl.so.3 \
libtinfo.so.6"

inherit rpm
