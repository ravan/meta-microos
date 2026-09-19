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

RPM_NAME = "libdotconf0-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "59c8ad7afa814470f3d254187dfb93783559f43813edbf2b7a0c24920f5a9cedef30543cc3c8020119439d1bcc867dac36fce5ce0b7c823b71bf5cc78fa68806"

RPROVIDES:${PN} += "libdotconf-1-0-0 \
libdotconf.so.0 \
libdotconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
