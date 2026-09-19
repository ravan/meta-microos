SUMMARY = "Documentation for texlive-mcite"
DESCRIPTION = "This package includes the documentation for texlive-mcite"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-mcite-doc-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "8b90437ed0cd5037fe4d941c7e594f3f525163f80120096f7101b6ef0f9e5dc5a3821cb677443573c6f976f86f26efa167e509ec9821abb2a41c3aa5bd21f7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
