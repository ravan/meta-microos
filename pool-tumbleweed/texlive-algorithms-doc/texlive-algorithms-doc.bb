SUMMARY = "Documentation for texlive-algorithms"
DESCRIPTION = "This package includes the documentation for texlive-algorithms"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-algorithms-doc-2026.226.0.0.1svn78101-61.2.noarch.rpm"
RPM_HASH = "c858feefdb80582d507877acfd281ff6ffdcc570918db4ab615a007046f8efd2bc56c5048b2aeea7f785b854cbb8ba798c79c3fac5faf3c61ae01bc8f59e150b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithms-doc"

RDEPENDS:${PN} += ""

inherit rpm
