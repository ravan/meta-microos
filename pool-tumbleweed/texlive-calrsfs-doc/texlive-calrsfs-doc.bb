SUMMARY = "Documentation for texlive-calrsfs"
DESCRIPTION = "This package includes the documentation for texlive-calrsfs"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-calrsfs-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "868b9c8fc2958d97e3856c64e41cb08f9794cf3ae498857e972a8941b78e1d48b35bebb2a4c755c248714979e3a723003450b4ebb89c40116045225b2150372b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calrsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
