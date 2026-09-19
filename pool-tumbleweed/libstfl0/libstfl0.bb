SUMMARY = "Structured Terminal Forms Library"
DESCRIPTION = "STFL is a library which implements a curses-based widget set for text \
terminals. The STFL API can be used from C, SPL, Python, Perl and Ruby. \
 \
A special language (the Structured Terminal Forms Language) is used to \
describe STFL GUIs."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libstfl0-0.24-5.8.aarch64.rpm"
RPM_HASH = "172080d30140f2915da8d7a9ca3bfb7429d86b8f9c43e81e5118a97a28733316f9a95202f1a7c8fc8c5cbc8399d48cedc8c916bc561a65c8184eb2ff9b278a7b"

RPROVIDES:${PN} += "libstfl.so.0 \
libstfl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
