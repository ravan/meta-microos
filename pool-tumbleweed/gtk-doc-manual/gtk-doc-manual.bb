SUMMARY = "Manual for Gtkdoc"
DESCRIPTION = "User manual for Gtkdoc"
LICENSE = "GFDL-1.1-or-later"

PV = "1.36.1"

RPM_NAME = "gtk-doc-manual-1.36.1-1.2.noarch.rpm"
RPM_HASH = "450f21518ae2b96c9dd9b5dad2af206a2b861012c02f4eef2689c2f93c9ae0affbb1a7d505550c869fb7ccb945865f93fc773f2a1e1c52c6cb580d83e12ad9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-doc-/usr/share/help/C/gtk-doc-manual/index.docbook \
gtk-doc-manual"

RDEPENDS:${PN} += ""

inherit rpm
