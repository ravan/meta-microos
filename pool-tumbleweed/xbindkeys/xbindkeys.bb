SUMMARY = "Events Grabbing Program for X-Window"
DESCRIPTION = "xbindkeys is a program that associates keys or mouse buttons to shell commands \
under X. After a little configuration, it can start many commands with the \
keyboard (e.g. control+alt+x starts an xterm) or with the mouse buttons. \
 \
 \
guile support is disabled in this package. \
To enable guile support, rebuild the src.rpm and pass --with guile \
to rpmbuild."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.7"

RPM_NAME = "xbindkeys-1.8.7-1.19.aarch64.rpm"
RPM_HASH = "6276ef5d9f57d69edcaba0acd210f69f6d89dffe7b20588fd4332251d7bdb36c5afd7c3e5bdd7ffeeb8319d57089fd903ffb40535b07006aa22d872b6f527768"

RPROVIDES:${PN} += "xbindkeys"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tk"

inherit rpm
