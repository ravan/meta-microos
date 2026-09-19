SUMMARY = "Samples for use with OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides some samples for use with openVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-sample-2026.3.1-1.2.noarch.rpm"
RPM_HASH = "757d696bdf4fc3d8380194f7edec02830a8be61571115204ec8228cd50db428e53796859bbfb8226207ff9b581f078a26d2fa0465aa996bc9673a3b39f39d548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvino-sample"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
