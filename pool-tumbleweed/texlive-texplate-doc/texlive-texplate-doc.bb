SUMMARY = "Documentation for texlive-texplate"
DESCRIPTION = "This package includes the documentation for texlive-texplate"
LICENSE = "BSD-3-Clause"

PV = "2026.227.1.0.6svn71963"

RPM_NAME = "texlive-texplate-doc-2026.227.1.0.6svn71963-62.2.noarch.rpm"
RPM_HASH = "a344e28f4fdb5ef6ed25a7fd187bc0fa19132111fb6dc65f0e82c3c355d7c3eac223ec4d0b00572d687cc5ef04fe8c4bd72381a90448bb018f92028d1168705b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
