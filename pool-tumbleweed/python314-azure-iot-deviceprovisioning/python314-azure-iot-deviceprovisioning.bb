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

RPM_NAME = "python314-azure-iot-deviceprovisioning-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "52678b7825f9549fed0230d46d60171d1deb000583a3134ccd6d3a21876c60678216fe3ee3f32cf97ef746c36ad7b7097d3b0509c9a01a1b2dd03fcba1dc49eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-iot-deviceprovisioning \
python314-azure-iot-deviceprovisioning \
python3dist-azure-iot-deviceprovisioning"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-iot-nspkg"

inherit rpm
