SUMMARY = "Documentation for texlive-sesstime"
DESCRIPTION = "This package includes the documentation for texlive-sesstime"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74748"

RPM_NAME = "texlive-sesstime-doc-2026.226.1.1.3svn74748-60.2.noarch.rpm"
RPM_HASH = "c7815ed52bbdbba8b49c404ebd703caca84ad0c40f11121df763b39fc345ea3d010b1bc7d639a18a8f8ac773871c7a90c5152e62bd88bd949033680f4439d167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sesstime-doc"

RDEPENDS:${PN} += ""

inherit rpm
