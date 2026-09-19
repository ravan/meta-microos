SUMMARY = "Documentation for texlive-junicodevf"
DESCRIPTION = "This package includes the documentation for texlive-junicodevf"
LICENSE = "OFL-1.1"

PV = "2026.226.2.218svn77682"

RPM_NAME = "texlive-junicodevf-doc-2026.226.2.218svn77682-63.2.noarch.rpm"
RPM_HASH = "dd2fae9ba9e19f4710d34aecb51ce31ef9ba2b847878226f8456db4cd413be4266fd0baac70254c85d176175643dc76bcf1e7df880ac787cc8baeba0a3e8ecf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-junicodevf-doc"

RDEPENDS:${PN} += ""

inherit rpm
