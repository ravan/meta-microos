SUMMARY = "Documentation for texlive-excludeonly"
DESCRIPTION = "This package includes the documentation for texlive-excludeonly"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn17262"

RPM_NAME = "texlive-excludeonly-doc-2026.226.1.0svn17262-59.2.noarch.rpm"
RPM_HASH = "19cdadcff60d13119693946e237303e6977160d27d55f53e385ce42caaf3b3f0766d857c41fcf228af08a03f371764c133d9f4dfdef5a3929a48ddf84bf36bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-excludeonly-doc"

RDEPENDS:${PN} += ""

inherit rpm
