SUMMARY = "Development files for the Osmocom VTY interface library"
DESCRIPTION = "The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmovty."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmovty-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "1787b9e27aadc7cfb503c49325f0c936617a13d46eeab802f71c01082423b560e0d123905f4b027f8fffd98b366f1dba984a7e4dfb854199327a248e4992b0ff"

RPROVIDES:${PN} += "libosmovty-devel \
pkgconfig-libosmovty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmovty13 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
