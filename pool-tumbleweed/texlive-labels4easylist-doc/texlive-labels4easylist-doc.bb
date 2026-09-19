SUMMARY = "Documentation for texlive-labels4easylist"
DESCRIPTION = "This package includes the documentation for texlive-labels4easylist"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-doc-2026.226.1.0svn51124-63.2.noarch.rpm"
RPM_HASH = "cd5465fe73988cac6df8d11be406cb193be5e36bded3668ddacfd6f260fba4ca7b98fd63f35219e263aefeac64385f44eb6cb77dac7fc715ba35a88ef6e159f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels4easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
