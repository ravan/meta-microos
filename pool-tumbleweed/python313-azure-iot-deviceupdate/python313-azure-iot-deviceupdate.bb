SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-iot-deviceupdate-1.0.0-2.9.noarch.rpm"
RPM_HASH = "e40499ed427f632dd0f0d473a1519519927b9d2b6e9eaa5a281dce7f6cbf38a2027086d24edc2ba7ee7c7ab5a431799dbf1c027f3b18a894cb82c3f7afd5d80f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-deviceupdate \
python3.13dist-azure-iot-deviceupdate \
python313-azure-iot-deviceupdate \
python3dist-azure-iot-deviceupdate"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-iot-nspkg"

inherit rpm
