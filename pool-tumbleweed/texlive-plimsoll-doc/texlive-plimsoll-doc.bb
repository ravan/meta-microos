SUMMARY = "Documentation for texlive-plimsoll"
DESCRIPTION = "This package includes the documentation for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn56605"

RPM_NAME = "texlive-plimsoll-doc-2026.226.1svn56605-59.2.noarch.rpm"
RPM_HASH = "a873f64da42c249e782bf28a1475c0c6d43bf1465d1186c9917134782e55a80ac1c6f9bab79b2747f8790386bc6dc186656a20f939b308d36e9cee7b8ae1640b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plimsoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
