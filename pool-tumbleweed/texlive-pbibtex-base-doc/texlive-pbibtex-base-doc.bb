SUMMARY = "Documentation for texlive-pbibtex-base"
DESCRIPTION = "This package includes the documentation for texlive-pbibtex-base"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn66085"

RPM_NAME = "texlive-pbibtex-base-doc-2026.226.svn66085-58.2.noarch.rpm"
RPM_HASH = "aee57bfd402511c17a5d4da87e075854d5177984b402e9ccd75626225fb9a447009ae8d17f552db281e651732fb29a0a064de4013b223406799ee57d49096941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
