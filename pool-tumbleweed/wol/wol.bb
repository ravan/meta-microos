SUMMARY = "Wake On Lan client"
DESCRIPTION = "The Wake On Lan client wakes up magic packet compliant machines such as \
boxes with wake-on-lan ethernet-cards. Some workstations provide \
SecureON which extends wake-on-lan with a password. This feature is \
also provided by wol."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-0.7.1-165.3.aarch64.rpm"
RPM_HASH = "31ad27f17b1963b7a15b130be4909920752bbfa1e2e0faeba60448f0bcbc23d8e5d54347125878607c99fc798d7a9228144601b5a4cde9602fe94da35cb10083"

RPROVIDES:${PN} += "wol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
