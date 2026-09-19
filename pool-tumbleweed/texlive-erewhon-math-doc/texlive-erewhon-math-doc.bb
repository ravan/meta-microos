SUMMARY = "Documentation for texlive-erewhon-math"
DESCRIPTION = "This package includes the documentation for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78171"

RPM_NAME = "texlive-erewhon-math-doc-2026.226.0.0.73svn78171-61.4.noarch.rpm"
RPM_HASH = "8f223db23ee9adb59fb855e1eed0fc5e204c49e37d70fb4920a567ceeab27895597861b216ff633e23fab92cdd4162398e31efdfa51ec3026fa68b911b9f08ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
