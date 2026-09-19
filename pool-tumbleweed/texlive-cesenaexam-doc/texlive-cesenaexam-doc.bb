SUMMARY = "Documentation for texlive-cesenaexam"
DESCRIPTION = "This package includes the documentation for texlive-cesenaexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-doc-2026.226.0.0.2svn44960-59.2.noarch.rpm"
RPM_HASH = "0200908c27267fc7662ee9658a0be1326a266a3f95e19f6bcb4a796369cab54db08eb1fd7bcd0ded8d64d0946a08d2c42304c3ee0674dfd86b325f08165b82e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cesenaexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
