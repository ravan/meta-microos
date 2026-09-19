SUMMARY = "Script for generating man pages from --help output"
DESCRIPTION = "help2man is a script to create simple man pages from the --help and \
--version output of programs. \
 \
Since most GNU documentation is now in info format, this provides a way \
to generate a placeholder man page pointing to that resource while \
still providing some useful information."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-1.49.3-1.17.aarch64.rpm"
RPM_HASH = "b7b94af0f5c97a9d16b62b1bc349b3cd0054bc583db3180056b86b544f69cee58635c7f448d170f846c6471fd1292c3db55b7a8adf5b1b561a16d5b1a0923155"

RPROVIDES:${PN} += "help2man"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-gettext"

inherit rpm
