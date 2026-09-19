SUMMARY = "Documentation for texlive-graphics-def"
DESCRIPTION = "This package includes the documentation for texlive-graphics-def"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76719"

RPM_NAME = "texlive-graphics-def-doc-2026.226.svn76719-60.4.noarch.rpm"
RPM_HASH = "f445bc9e219e5ac10eddddcbd4522ad50178e9f8fedb3073f594a35a1e52658c357ddd27901c810f0ea060e21a68b12b3421b11a682112bcbbf8353ddc1f7bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-def-doc"

RDEPENDS:${PN} += ""

inherit rpm
