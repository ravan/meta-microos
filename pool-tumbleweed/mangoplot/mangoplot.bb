SUMMARY = "Local visualization"
DESCRIPTION = "mangoplot is a plotting script that is shipped with MangoHud: on a given folder, \
it takes each log file, makes a 1D heatmap of its framerates, \
then stacks the heats maps vertically to form a 2D graph for \
easy visual comparison between benchmarks."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "mangoplot-0.8.4-1.3.noarch.rpm"
RPM_HASH = "79fcea301942689feaaaf4a29dedb98928eebd54e7c81f60bc3374c2aa6ca15486b768a607e77121aa1075af1cebd23c9a67973a0832589fc3ac0f3adf26e5e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mangoplot"

RDEPENDS:${PN} += "/usr/bin/python3 \
mangohud"

inherit rpm
