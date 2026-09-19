SUMMARY = "Documentation for texlive-xifthen"
DESCRIPTION = "This package includes the documentation for texlive-xifthen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-xifthen-doc-2026.226.1.4.0svn77682-59.4.noarch.rpm"
RPM_HASH = "c335a9930fa1f9e000a3e7325cae10e707dabd127ee5007d49ffd7004a2b1f366d51c39005736c1282679327cd98b574543f777b799ba9d5220bfdf26394fd65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xifthen-doc"

RDEPENDS:${PN} += ""

inherit rpm
