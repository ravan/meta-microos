SUMMARY = "Module for use with openVINO toolkit to send usage statistics with user consent"
DESCRIPTION = "OpenVINO Telemetry is a package for sending statistics with user's consent, \
used in combination with other OpenVINO packages."
LICENSE = "Apache-2.0"

PV = "2026.3.1"

RPM_NAME = "python3-openvino-telemetry-2026.3.1-1.1.noarch.rpm"
RPM_HASH = "7c8616552bb123b9563e438ec6b0150597c051f5ff74852c45391e29915a7d60c9be00207ac9e9be72aa689f5ca40c325d4f10e982d0d17aeda3883b4644f6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openvino-telemetry \
python3.13dist-openvino-telemetry \
python3dist-openvino-telemetry"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
