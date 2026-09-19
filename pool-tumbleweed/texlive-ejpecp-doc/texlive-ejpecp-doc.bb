SUMMARY = "Documentation for texlive-ejpecp"
DESCRIPTION = "This package includes the documentation for texlive-ejpecp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-doc-2026.226.1.11.3svn60950-61.4.noarch.rpm"
RPM_HASH = "095611ad95535df622a1b17241ccad4f6a926a97ac0dd18039f947eeb198ecbe11a84cb31983806e45e2bb60fb2b0d1ec3d5bc0251a701670295cf67d38f5e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ejpecp-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
