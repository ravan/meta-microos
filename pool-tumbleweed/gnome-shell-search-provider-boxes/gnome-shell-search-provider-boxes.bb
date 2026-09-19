SUMMARY = "Shell search provider for GNOME Boxes"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Boxes."
LICENSE = "LGPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-boxes-50.0-2.2.aarch64.rpm"
RPM_HASH = "1f716c641e056a819529522ad2a06cbbcac436a08c8eeb36e5d6ff60a105ab3285ee3f5822797dae6d99a1a2ec03d27737ba457c3e6ddee2be0025002a5ea783"

RPROVIDES:${PN} += "gnome-shell-search-provider-boxes"

RDEPENDS:${PN} += "gnome-boxes \
gnome-shell \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
