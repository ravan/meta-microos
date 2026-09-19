SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-qcom-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "7e780bade909b062fcfad0d71bfa4a1623e21c111e5e2e7da5d41a1e097c93d25bc2746e1771e67e8591103e8c3931e9b7dcda0c9398a1d8cd6ac333d9fd3dcc"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
