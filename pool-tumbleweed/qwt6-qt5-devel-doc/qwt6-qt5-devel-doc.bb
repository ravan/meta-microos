SUMMARY = "Development documentation for Qwt(Qt5)"
DESCRIPTION = "This package contains the development documentation of the Qwt(Qt5) widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt5-devel-doc-6.3.0-1.9.noarch.rpm"
RPM_HASH = "fa34c876b9dce3b38a2a5169fdec61b42334254675970d668650457338033478ee8e5631642d01db6435cba6175fcc1757f114dfe04eb29d418be2f77ac1453a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qwt6-qt5-devel-doc"

RDEPENDS:${PN} += "qwt6-qt5-devel"

inherit rpm
