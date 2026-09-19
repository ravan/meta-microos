SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-iot-deviceupdate-1.0.0-2.9.noarch.rpm"
RPM_HASH = "22c95ff7e4d5723ec7ca772a3435bab539c6b8d7357b875263ddb2e91354dddbda72803a0835853d8c5a0b598510eff9bc24f2b3d8bf5ce9dc33a11a2f5ff7ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-iot-deviceupdate \
python314-azure-iot-deviceupdate \
python3dist-azure-iot-deviceupdate"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-iot-nspkg"

inherit rpm
