SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-iot-nspkg-1.0.1-2.9.noarch.rpm"
RPM_HASH = "f561f55b87864e0007bb00ea24ab80765ee1ee51beb7d7b41391478af5824bd043ccad189eeb9a94fa0a5d2e59b083b048c70358f4d1aaf16e393ce60c993b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-iot-nspkg \
python314-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
