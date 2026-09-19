SUMMARY = "Microsoft Azure IoT Device Provisioning Client Library for Python"
DESCRIPTION = "The IoT Hub Device Provisioning Service (DPS) is a helper service for \
IoT Hub that enables zero-touch, just-in-time provisioning to the right \
IoT hub without requiring human intervention, allowing customers to \
provision millions of devices in a secure and scalable manner. \
 \
This service SDK provides data plane operations for backend apps. You \
can use this service SDK to create and manage individual enrollments \
and enrollment groups, and to query and manage device registration records."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-iot-deviceprovisioning-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "184cdac2002d7869771b62d3d6c7e31320b1fa17e36b12c27c081a2a5f4ac4f9d53abd59f128d505b9555737cc453553e2650ad7581bb1a3ee422bf87b1bae33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-deviceprovisioning \
python3.13dist-azure-iot-deviceprovisioning \
python313-azure-iot-deviceprovisioning \
python3dist-azure-iot-deviceprovisioning"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-iot-nspkg"

inherit rpm
