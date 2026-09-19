SUMMARY = "Off-The-Record messaging plugin for irssi"
DESCRIPTION = "This plugin adds Off-the-Record messaging support for the irssi IRC client. \
Although primarily designed for use with the bitlbee IRC2IM gateway, it \
works within any query window, provided that the conversation partner's IRC \
client supports OTR. \
 \
OTR allows you to have private conversations over IM by providing: \
 \
 - Encryption \
   - No one else can read your instant messages. \
 - Authentication \
   - You are assured the correspondent is who you think it is. \
 - Deniability \
   - The messages you send do _not_ have digital signatures that are \
     checkable by a third party.  Anyone can forge messages after a \
     conversation to make them look like they came from you.  However, \
     _during_ a conversation, your correspondent is assured the messages \
     he sees are authentic and unmodified. \
 - Perfect forward secrecy \
   - If you lose control of your private keys, no previous conversation \
     is compromised."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "irssi-otr-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "fbf1c6211c19942b091d38f08c2a2a0eafde871e730a27e0e8969d967f91aac9a592cbf221880e50e9d498152e2f9edf7b4f261bd192e8bbfe75a7534415e9d5"

RPROVIDES:${PN} += "irssi-otr \
libotr.so"

RDEPENDS:${PN} += "irssi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libotr.so.5"

inherit rpm
