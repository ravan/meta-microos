SUMMARY = "GLib-based Instant Messenger Library -- openSUSE Default Configuration"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, Lotus Sametime, MXit, MySpaceIM, and \
Zephyr. It can support many more with plugins. \
 \
This package provides the openSUSE default configuration for libpurple."
LICENSE = "BSD-3-Clause"

PV = "42.2"

RPM_NAME = "libpurple-branding-openSUSE-42.2-1.33.noarch.rpm"
RPM_HASH = "b418a7df1a8b50fe9eb4ece7491fa2777de616e956c05ebb2e2e5e67e7a3a4a6f796140d827fe5b907f8a6d2cfdb4398c3c18dc3a50d74feb7f1e42ca1aede3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libpurple-branding-openSUSE \
libpurple-branding \
libpurple-branding-openSUSE \
pidgin-branding-openSUSE"

RDEPENDS:${PN} += "libpurple"

inherit rpm
