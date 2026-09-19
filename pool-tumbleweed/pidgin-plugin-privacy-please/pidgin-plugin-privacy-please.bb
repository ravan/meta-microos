SUMMARY = "Anti-spam plugin for Pidgin"
DESCRIPTION = "Pidgin Privacy Please is an anti-spam plugin for the Pidgin instant \
messenger. It offers the following features: \
 * Block individual users. \
 * Auto-reply to blocked messages. \
 * Block messages from people who are not on your contact list \
   (with an optional auto-reply). \
 * Block messages using regular expressions, either against the \
   message sender, the message content, or both. \
 * Suppress repeated/all authorisation requests. \
 * Suppress ICQ/AIM authorisation requests. \
 * Suppress authorisation requests that contain hyperlinks. \
 * Automatically show user info on authorisation requests. \
 * Block jabber headline messages. \
 * Block AOL system messages. \
 * Challenge-response bot-check."
LICENSE = "GPL-3.0+"

PV = "0.7.1"

RPM_NAME = "pidgin-plugin-privacy-please-0.7.1-1.35.aarch64.rpm"
RPM_HASH = "abbb40284056e3a909afcf35e88ae42a946132ed1be8d7fa6640eab8f6985f8d4a6c571eb6bd0f022fbf0fa3367a5f9ef44451380146793d3c43102c97c7f324"

RPROVIDES:${PN} += "libpidgin-pp.so \
pidgin-plugin-privacy-please"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
