SUMMARY = "Documentation for texlive-egameps"
DESCRIPTION = "This package includes the documentation for texlive-egameps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-egameps-doc-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "b8de79ac53587f9cd320f4b27f37b165af36e18b3d7fc6b562e962b414a9cec8bb02e42b6b4617465d3bb0f8bd97413eef47d05fc5edcad471bb51a1a6a957c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egameps-doc"

RDEPENDS:${PN} += ""

inherit rpm
