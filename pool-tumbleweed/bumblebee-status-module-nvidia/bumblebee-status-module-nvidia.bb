SUMMARY = "Displays GPU name, temperature and memory usage"
DESCRIPTION = "Displays GPU name, temperature and memory usage."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-2.1.5-4.7.noarch.rpm"
RPM_HASH = "2c09b2aafa059ba0e39109e4eace3b671279acc4a81ca17ddc46dfcb6793631933d8e9210c215ba37d4c1eddddd610d8190689e51d9ec1249a2088d93b782e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
