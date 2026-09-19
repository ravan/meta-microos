SUMMARY = "Configuration file parser library"
DESCRIPTION = "dotconf is a configuration-file parser \
library written in C. The configuration files created for dotconf look \
similar to those used by the Apache web server. Even \
container directives known from httpd.conf can be used in the \
same manner as for Apache modules. It supports various types of \
arguments, dynamically loadable modules that create their own \
configuration options on-the-fly, a here-documents feature to pass \
long ARG_STR data to programs, and on-the-fly inclusion of additional \
config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "dotconf-devel-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "4afa85e8b4d4dad51ae99cc06e795142b6c93813de639d681d6da25c55a63048afe0d13311ac0ff823192d43ecc5b53dd8d2fc4273a7bd22e28aa3c87b85a849"

RPROVIDES:${PN} += "dotconf \
dotconf-devel \
pkgconfig-dotconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdotconf0"

inherit rpm
