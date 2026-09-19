SUMMARY = "Development files for the dLeyna libraries"
DESCRIPTION = "dleyna is a library of utility functions that are used by the \
higher level dLeyna libraries that communicate with DLNA devices, \
e.g., dleyna-server. \
 \
In brief, it provides APIs for logging, error, settings and task \
management and an IPC abstraction API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "dLeyna-devel-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "dc319127d9f608ab4411804c7697bd6750b4863c54b69072372d7cd4a7d555a1159f052b23566b5bc20564a29441c43c4f37a2d2da5801b4a49e00cbfbe82858"

RPROVIDES:${PN} += "dLeyna-devel \
dleyna-core-devel \
dleyna-renderer-devel \
dleyna-server-devel \
pkgconfig-dleyna-core-1.0 \
pkgconfig-dleyna-renderer-service-1.0 \
pkgconfig-dleyna-server-service-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dLeyna \
pkgconfig-dleyna-core-1.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gupnp-1.6 \
pkgconfig-gupnp-av-1.0 \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0"

inherit rpm
