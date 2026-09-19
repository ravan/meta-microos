SUMMARY = "Documentation for texlive-fontools"
DESCRIPTION = "This package includes the documentation for texlive-fontools"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77722"

RPM_NAME = "texlive-fontools-doc-2026.226.svn77722-60.2.noarch.rpm"
RPM_HASH = "2a15d5578449a783d68aa44dd7a226f65262316e86582271184838a9bd69071c734112f6221890d1b652ea6e67db4cea16a7d118db56cf1cfb662b05510750b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2afm.1 \
man-autoinst.1 \
man-ot2kpx.1 \
texlive-fontools-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
