SUMMARY = "GLib-based Instant Messenger Library -- Upstream default configuration"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins. \
 \
This package provides the upstream default configuration for Pidgin."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "libpurple-branding-upstream-2.14.14-2.3.noarch.rpm"
RPM_HASH = "a301a3cf97f9e487e165f4b1166ae8f40820fdde4b105d6246442d808524c949e3f7e983770d59ad460636792806e9dc86c091339f828f0f2885fa4d62b8a92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libpurple-branding-upstream \
libpurple-branding \
libpurple-branding-upstream"

RDEPENDS:${PN} += "libpurple"

inherit rpm
