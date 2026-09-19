SUMMARY = "Development files gpu-screen-recorder"
DESCRIPTION = "This subpackage contains header files for developing plugins gpu-screen-recorder."
LICENSE = "GPL-3.0-only"

PV = "20260818"

RPM_NAME = "gpu-screen-recorder-devel-20260818-1.1.noarch.rpm"
RPM_HASH = "2a6adb611be1e0f5ea4f1f7841d0e50acc7e728814c0e44d321766cf1908e6a9ade65f8023e5bb5897ed38003df5ba43cd67c894afcc9934a52c534b18989255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpu-screen-recorder-devel"

RDEPENDS:${PN} += ""

inherit rpm
