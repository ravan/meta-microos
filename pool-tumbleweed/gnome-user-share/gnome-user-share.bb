SUMMARY = "GNOME user file sharing"
DESCRIPTION = "gnome-user-share is a small package that binds together various free \
software projects to bring easy to use user-level file sharing to the \
masses. \
 \
The program is meant to run in the background when the user is logged \
in, and when file sharing is enabled a webdav server is started that \
shares the $HOME/Public folder. The share is then published to all \
computers on the local network using mDNS/rendezvous, so that it shows \
up in the Network location in GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "48.3"

RPM_NAME = "gnome-user-share-48.3-1.4.aarch64.rpm"
RPM_HASH = "93d593f3ed2a6e4e341f77d6fc62306f71e5b5c296c46bc8f4e38efbaf69c0dc33caaa4df38a4b9b0c0e08e0ba96fffba4e0d62aa97c78cca062802771338900"

RPROVIDES:${PN} += "gnome-user-share"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1"

inherit rpm
