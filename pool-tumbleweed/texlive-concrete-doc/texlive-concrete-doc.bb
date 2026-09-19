SUMMARY = "Documentation for texlive-concrete"
DESCRIPTION = "This package includes the documentation for texlive-concrete"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-concrete-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "68c8601f771520f2c8906aa0ee247c2e29efa6e615d78bf9ec9f6fa99801dc429a0058e199dfad5fdd2ec2568f9372ef2f27934b5b67ce31386fdff5c27ca207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concrete-doc"

RDEPENDS:${PN} += ""

inherit rpm
