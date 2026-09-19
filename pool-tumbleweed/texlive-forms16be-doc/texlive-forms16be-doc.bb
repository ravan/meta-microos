SUMMARY = "Documentation for texlive-forms16be"
DESCRIPTION = "This package includes the documentation for texlive-forms16be"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn51305"

RPM_NAME = "texlive-forms16be-doc-2026.226.1.3svn51305-60.2.noarch.rpm"
RPM_HASH = "41b7696202ff7786908db2f7f0409e4800004dca8547bcfafaa0bae665ba952d43c9c97017acbdcb019f3bc3e35fafb6f1c882d1b80edf6329ad40b2497c1175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forms16be-doc"

RDEPENDS:${PN} += ""

inherit rpm
