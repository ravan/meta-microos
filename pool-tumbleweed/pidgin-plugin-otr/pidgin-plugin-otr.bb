SUMMARY = "'Off The Record' end-to-end encryption plugin for Pidgin"
DESCRIPTION = "This is a Pidgin plugin which implements Off-the-Record (OTR) \
Messaging. OTR allows you to have private conversations over IM by \
providing: \
 * Encryption. \
 * No one else can read your instant messages. \
 * Authentication. \
 * You are assured the correspondent is who you think it is. \
 * Deniability. \
 * The messages you send do not have digital signatures that are \
   checkable by a third party. Anyone can forge messages after a \
   conversation to make them look like they came from you. \
   However, during a conversation, your correspondent is assured \
   the messages he sees are authentic and unmodified. \
 * Perfect forward secrecy. \
 * If you lose control of your private keys, no previous \
   conversation is compromised."
LICENSE = "GPL-2.0+"

PV = "4.0.2"

RPM_NAME = "pidgin-plugin-otr-4.0.2-3.35.aarch64.rpm"
RPM_HASH = "8c832eadd224c4002ed9f179ed5fc78ac23f9cd946c02f32489b7af64f3785f6f2fcf169202b55de56708a44137626d7f30fd44e8f3a78678529d07ec17e3cd1"

RPROVIDES:${PN} += "pidgin-otr \
pidgin-plugin-otr"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libotr.so.5 \
pidgin"

inherit rpm
