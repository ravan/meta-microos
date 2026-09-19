SUMMARY = "Documentation for texlive-xechangebar"
DESCRIPTION = "This package includes the documentation for texlive-xechangebar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-xechangebar-doc-2026.226.1.0svn77682-59.4.noarch.rpm"
RPM_HASH = "42e1289792a30f4d819d235c5c6561d50828b07a9ad0c25714c8cb94cdfdbfd9ad2bd41097606412389228a4ad9ead97b93dff1cef9fb57fa0b0116f99394b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xechangebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
