SUMMARY = "Documentation for texlive-sourceserifpro"
DESCRIPTION = "This package includes the documentation for texlive-sourceserifpro"
LICENSE = "OFL-1.1"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-sourceserifpro-doc-2026.226.1.4svn77682-64.2.noarch.rpm"
RPM_HASH = "6416b3f3e1d2e91eccaabb7f4dc925f93613871f161e183ffb10001b813791e155a3a2c75a9968e3c11fd91d06b17e470cc36154d2001d6c291e69a474a5e681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourceserifpro-doc"

RDEPENDS:${PN} += ""

inherit rpm
