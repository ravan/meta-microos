SUMMARY = "Documentation for texlive-makedtx"
DESCRIPTION = "This package includes the documentation for texlive-makedtx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77871"

RPM_NAME = "texlive-makedtx-doc-2026.226.1.3svn77871-59.2.noarch.rpm"
RPM_HASH = "54f38b53da7931187a5de64e6020abd02db9f6dd8318b64e8bf16d18a5fa66aaf2748b9c4ec3819f2f74f385e16d25366b54f4ea081fe6b2edc1f1274957b8ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makedtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
