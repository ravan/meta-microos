SUMMARY = "Kea DHCP logging system library"
DESCRIPTION = "This library contains the Kea logging system, which is based on the \
log4J logging system common in Java development, and includes the \
following ideas: a set of severity levels; a hierarchy of logging \
sources; separation of message use from message text."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-log86-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "f3841f17f116e8777370dd0535ebc08425be572a4178a40fc549fbc25e13a36ec6e13fa0c0829f255f329a1816a7f0c225870dc47d1b22ccdb353d13221e9eba"

RPROVIDES:${PN} += "libkea-log.so.86 \
libkea-log86"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.55 \
libkea-log-interprocess.so.4 \
libkea-util.so.118 \
liblog4cplus-2.1.so.9 \
libstdc++.so.6"

inherit rpm
