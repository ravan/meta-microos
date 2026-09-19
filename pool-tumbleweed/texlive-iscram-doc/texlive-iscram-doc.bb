SUMMARY = "Documentation for texlive-iscram"
DESCRIPTION = "This package includes the documentation for texlive-iscram"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn45801"

RPM_NAME = "texlive-iscram-doc-2026.226.1.1svn45801-63.2.noarch.rpm"
RPM_HASH = "da8b836ce7aba597fb8f561a7fdda94de26c1a0b78999fa14e9f191a8c47370c953c879f93bc6c40c04564f9035507c89a8804adb760e56c79c1b745cee34847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iscram-doc"

RDEPENDS:${PN} += ""

inherit rpm
