SUMMARY = "Documentation for texlive-csthm"
DESCRIPTION = "This package includes the documentation for texlive-csthm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73506"

RPM_NAME = "texlive-csthm-doc-2026.226.1.3svn73506-61.2.noarch.rpm"
RPM_HASH = "20ed8099a9726176fcc77c7fc894f4d12a2fec3602ff8b6a742f8e8c1f6bc010786b59dc0144a47d0d3283203354313e86bac4e5691c99cab9b8547c5367a315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csthm-doc"

RDEPENDS:${PN} += ""

inherit rpm
