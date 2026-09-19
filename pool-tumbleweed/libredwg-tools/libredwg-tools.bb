SUMMARY = "Command line utilities for handling DWG file"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains some command line utilities using this library."
LICENSE = "GPL-3.0-or-later"

PV = "0.14.8413"

RPM_NAME = "libredwg-tools-0.14.8413-1.2.aarch64.rpm"
RPM_HASH = "824955dd0a2331f9cecf4689c3dc5a0ba494048476db9918bcc6c68a8e32596f0b64fd6464a6d9dc3a8a583c5d8736d1be0d2e3e12a00d6ca7528193ab1f7b39"

RPROVIDES:${PN} += "libredwg-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcre2-16.so.0 \
libpcre2-8.so.0 \
libredwg.so.0"

inherit rpm
