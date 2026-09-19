SUMMARY = "Documentation for texlive-extarrows"
DESCRIPTION = "This package includes the documentation for texlive-extarrows"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.2.0svn77682"

RPM_NAME = "texlive-extarrows-doc-2026.226.1.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "5c235b3706e2eec6ae5580f84fab185c9fba1f656edaa4bdda44568685bd0a2f53f575eeda26ea34467cd4dd07b2db9637c9d0dc081b89d6530e79eb10af9959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
