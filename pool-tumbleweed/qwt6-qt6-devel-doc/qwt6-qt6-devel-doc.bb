SUMMARY = "Development documentation for Qwt(Qt6)"
DESCRIPTION = "This package contains the development documentation of the Qwt(Qt6) widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt6-devel-doc-6.3.0-1.10.noarch.rpm"
RPM_HASH = "226c411347fa111ae189098b1a9baa576dac8db9d3ae8e41a29eb6e688ab56ffaf35494e09fd775d7b864ed8e94ac73e52e3b8b3f5a8509a2008fa64e7c22df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qwt6-qt6-devel-doc"

RDEPENDS:${PN} += "qwt6-qt6-devel"

inherit rpm
