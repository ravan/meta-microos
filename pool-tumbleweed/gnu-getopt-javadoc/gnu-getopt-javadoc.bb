SUMMARY = "Javadoc for gnu.getopt"
DESCRIPTION = "The GNU Java getopt classes support short and long argument parsing in \
a manner 100% compatible with the version of GNU getopt in glibc 2.0.6 \
with a mostly compatible programmer's interface as well. Note that this \
is a port, not a new implementation. \
 \
This package contains the javadoc documentation for the GNU Java getopt \
classes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.14"

RPM_NAME = "gnu-getopt-javadoc-1.0.14-2.9.noarch.rpm"
RPM_HASH = "e49cb89af813cc2a9f2a2d8fa806d7c330c2fdb2e65b39f595aea666582a8327521111276e22f019688308931af5ab87f317b2843983f1e331580549a837f12d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
