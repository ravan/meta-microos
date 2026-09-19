SUMMARY = "Documentation for texlive-talos"
DESCRIPTION = "This package includes the documentation for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2026.227.1.0svn61820"

RPM_NAME = "texlive-talos-doc-2026.227.1.0svn61820-62.2.noarch.rpm"
RPM_HASH = "6f5c63a15074c0925d561f7fe332263ebcce50c3d2f3c9635fb265895df2035171d3eefee32e2df7289a0391dda8a0a0bfd3bf8ab94044b20f3db5e3938953fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos-doc"

RDEPENDS:${PN} += ""

inherit rpm
