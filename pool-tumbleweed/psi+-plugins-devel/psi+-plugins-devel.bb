SUMMARY = "Headers for Psi plugins"
DESCRIPTION = "Headers and qmake project include files for developing Psi+ plugins."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-devel-1.5.2112+0-1.6.noarch.rpm"
RPM_HASH = "a911601d4d6033081258acc1814a9b8b8b9a2ee88918b414496eb588bdc0bbb788155a661c325e05af680b65b5d432003f40024ba78428d3745950baa7d4eb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-plugins-devel"

RDEPENDS:${PN} += "psi+"

inherit rpm
