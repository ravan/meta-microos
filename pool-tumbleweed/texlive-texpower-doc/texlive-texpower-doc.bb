SUMMARY = "Documentation for texlive-texpower"
DESCRIPTION = "This package includes the documentation for texlive-texpower"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn29349"

RPM_NAME = "texlive-texpower-doc-2026.227.0.0.2svn29349-62.2.noarch.rpm"
RPM_HASH = "bab8143860dc66b2484b9893a710f35a84d06e40e705d1e6fbc4257dc0d50ce82686840050c86c0915851897427e429388be0314bf8bea3e410219dfa7d91db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texpower-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
