SUMMARY = "Structured Terminal Forms Library"
DESCRIPTION = "STFL is a library which implements a curses-based widget set for text \
terminals. The STFL API can be used from C, SPL, Python, Perl and Ruby. \
The API has only 14 function calls and generic SWIG bindings exist \
already for porting STFL to other scripting languages. \
 \
A special language (the Structured Terminal Forms Language) is used to \
describe STFL GUIs."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libstfl-devel-0.24-5.8.aarch64.rpm"
RPM_HASH = "26567a9362d5abdfb84049de37e808bde3abb899c8e47ff2a0d04c8f31f8478b7d1f08eb838aac9af93a30a57f5b4e77d36f8467c00d42fd25845d393b45ca58"

RPROVIDES:${PN} += "libstfl-devel \
pkgconfig-stfl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstfl0 \
ncurses-devel"

inherit rpm
