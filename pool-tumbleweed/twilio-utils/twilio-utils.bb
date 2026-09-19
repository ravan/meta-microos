SUMMARY = "Command line utilities for Twilio users"
DESCRIPTION = "The twilio-utils project contains a few UNIX command-line utilities \
that are handy when working with Twilio: \
 \
* twimsg - Send an outbound SMS message via Twilio \
* twils - List SMS messages from Twilio log \
* twirm - Delete SMS messages from Twilio log \
* twilog - Download Twilio [notifications into syslog \
* twiping - Send SMS ping containing test code \
* smslen - Calculate SMS payload length"
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "twilio-utils-1.2.2-1.11.aarch64.rpm"
RPM_HASH = "ca6fd7e6dc9243c1eb7b21898c88cedfcb3afa04495b380c0448261fe1a06db7412b8d2dc71b9110decc01f63640884f8f232fde780e5529d3f2a3cc03605c2d"

RPROVIDES:${PN} += "config-twilio-utils \
twilio-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
curl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxslt-tools \
php-cli \
util-linux-systemd \
xmlstarlet"

inherit rpm
