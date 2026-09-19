SUMMARY = "Development files for GnuDOS"
DESCRIPTION = "GnuDOS is a library designed to help new users of the GNU system, who are \
coming from a DOS background, fit into the picture and start using the GNU \
system with ease. It also addresses the console programmers of such programs \
that have the look and feel of old DOS system. \
 \
This package contains files required for development with GnuDOS."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "gnudos-devel-2.0-2.5.aarch64.rpm"
RPM_HASH = "79430f617c6f0e08d3942f63f37cea5982cc785210f08ecc17f860cd83e5a4e9e40663482b30cb3340bb30233ceef072ce9ae4bc83db1e690d97251e224298c8"

RPROVIDES:${PN} += "gnudos-devel"

RDEPENDS:${PN} += "libgnudos2"

inherit rpm
