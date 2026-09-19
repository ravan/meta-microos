SUMMARY = "Documentation for texlive-libertinus-type1"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-type1"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76891"

RPM_NAME = "texlive-libertinus-type1-doc-2026.226.svn76891-61.2.noarch.rpm"
RPM_HASH = "7e9fe2a6835606c860f275cd59fed04d4d13cb1370a070718837d18639edd251efc1fa5083ef04c76c354d89830696367a8b056a0a039f8563be8291ed51a515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
