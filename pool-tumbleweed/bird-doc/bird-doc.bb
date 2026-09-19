SUMMARY = "Documentation for the BIRD Internet Routing Daemon"
DESCRIPTION = "The BIRD project aims to develop a fully functional dynamic IP routing daemon \
primarily targeted on (but not limited to) Linux, FreeBSD and other UNIX-like \
systems and distributed under the GNU General Public License. \
 \
This package holds the PDF documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.2"

RPM_NAME = "bird-doc-2.19.2-1.1.noarch.rpm"
RPM_HASH = "6c9ee8c320ee5014f51818174a574b8e84010dd67a12503b36a9d4a1aad7eefd5ab3bd84f733f793ef4f185b564af509c7a22202b5b44ceed22f8646379faf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bird-doc"

RDEPENDS:${PN} += ""

inherit rpm
