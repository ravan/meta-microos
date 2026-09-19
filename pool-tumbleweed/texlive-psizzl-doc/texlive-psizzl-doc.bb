SUMMARY = "Documentation for texlive-psizzl"
DESCRIPTION = "This package includes the documentation for texlive-psizzl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.35svn69742"

RPM_NAME = "texlive-psizzl-doc-2026.226.0.0.35svn69742-59.2.noarch.rpm"
RPM_HASH = "60ec867bca3a3776c2dbdddd087d16491d06be844406459b119d17f2373b0aad8d055e5e8f4a099394810fb978c7d6f607b8b15a4b11edf6b1448068a235c108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psizzl-doc"

RDEPENDS:${PN} += ""

inherit rpm
