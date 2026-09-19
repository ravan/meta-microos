SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-iot-nspkg-1.0.1-2.9.noarch.rpm"
RPM_HASH = "8be5505ce0b9a8950331b91b27bae4ef6bcba35080493291757ee9e93ae04e56b6352d3033c68495397f7be6cd6a55675f3910af91fe7ae740c53bf9d46ab762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-nspkg \
python3.13dist-azure-iot-nspkg \
python313-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
