SUMMARY = "Widget for docker containers running"
DESCRIPTION = "Displays the number of docker containers running."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-docker-ps-2.1.5-4.7.noarch.rpm"
RPM_HASH = "886ded9f2c0191f7cf9ad685ef87a84096d3f506412abbaf0f1c9fa1c8ef30702d56229279e9bc010816f1a5f15ca45f7abca6b6115295c9f0329db01c4f5e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-docker-ps"

RDEPENDS:${PN} += "bumblebee-status \
python3-docker"

inherit rpm
