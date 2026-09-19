SUMMARY = "Documentation for texlive-secretx"
DESCRIPTION = "This package includes the documentation for texlive-secretx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10.9svn77296"

RPM_NAME = "texlive-secretx-doc-2026.226.0.0.10.9svn77296-60.2.noarch.rpm"
RPM_HASH = "1bd3037110699cbd7c64af2b6e7ccc5d1b0ab9dc2a9be5cc45170e7610b57e9f07ee05aa0ca526e7f6444cc6f8c14407d1ed6be8a1f5958c7dd473005d12445f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secretx-doc"

RDEPENDS:${PN} += ""

inherit rpm
