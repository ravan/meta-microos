SUMMARY = "Documentation of CLisp"
DESCRIPTION = "CLISP documentation is placed in the following directories: \
 \
/usr/share/doc/packages/clisp/ \
 \
/usr/share/doc/packages/clisp/doc/ \
 \
As well as the conventional CLISP, this package also includes CLX, an \
extension of CLISP for the X Window System. The X Window System must be \
installed before running the clx command. The description of this CLX \
version (new-clx) is placed in \
 \
/usr/share/doc/packages/clisp/clx/ \
 \
with the file README. The subdirectory \
 \
/usr/share/doc/packages/clisp/clx/demos/ \
 \
contains two nice applications."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.49.95"

RPM_NAME = "clisp-doc-2.49.95-1.10.noarch.rpm"
RPM_HASH = "9caf34547bfe15a35c2baa0ff3697b9b3c29b75d5a7e14a7fc89041f2cbeaf0b8c9368a03b878ac135c0bd40ccf86b3004a50cbb352dd9b86f05ed1bf3d3b7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clisp-doc"

RDEPENDS:${PN} += "clisp"

inherit rpm
