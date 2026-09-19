SUMMARY = "'Off The Record' messaging library toolkit"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations \
over instant messaging by providing: Encryption No one else can read \
your instant messages. Authentication You are assured the correspondent \
is who you think it is. Deniability The messages you send do not have \
digital signatures that are checkable by a third party. Anyone can \
forge messages after a conversation to make them look like they came \
from you. However, during a conversation, your correspondent is assured \
the messages he sees are authentic and unmodified. Perfect forward \
secrecy If you lose control of your private keys, no previous \
conversation is compromised."
LICENSE = "GPL-2.0-only"

PV = "4.1.1"

RPM_NAME = "libotr-tools-4.1.1-4.12.aarch64.rpm"
RPM_HASH = "dd5a00ae3549cf7d7a581430bb64ea7f7dc6cd07deec1e591cacbe457e6cb4839b8a188cd84f00f313db94008c848a4678452e0791e9ee849b40fd0e2ccb2d14"

RPROVIDES:${PN} += "libotr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libotr.so.5"

inherit rpm
