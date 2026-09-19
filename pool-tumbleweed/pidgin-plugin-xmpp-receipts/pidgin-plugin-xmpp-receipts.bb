SUMMARY = "Implementation of XMPP message delivery receipts for Pidgin"
DESCRIPTION = "This plugin for Pidgin implements XMPP message delivery receipts (XEP-0184)."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "pidgin-plugin-xmpp-receipts-0.8-1.29.aarch64.rpm"
RPM_HASH = "9b4544589cbbcf683b01802576a5f86b035c5ff35cf740d47731d1c7fd04401823ff958bbb7a35ac8ba571730cfe09b1c38f4c135b3f0b6a3e4e2adc2509fdc6"

RPROVIDES:${PN} += "pidgin-plugin-xmpp-receipts \
pidgin-xmpp-receipts"

RDEPENDS:${PN} += "libc.so.6 \
pidgin"

inherit rpm
