SUMMARY = "Documentation for texlive-huffman"
DESCRIPTION = "This package includes the documentation for texlive-huffman"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn67071"

RPM_NAME = "texlive-huffman-doc-2026.226.0.0.1svn67071-60.2.noarch.rpm"
RPM_HASH = "c99283d4167c0033b62d960aa1d9ee1c79e69a565a8b99629008a8737979b4ae077cf433c0fb580ff3ab3abb0f4cc69eede8e5576a41a67dd7895e4eddf96c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huffman-doc"

RDEPENDS:${PN} += ""

inherit rpm
