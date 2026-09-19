SUMMARY = "YaST2 - Multipath Configuration"
DESCRIPTION = "Multipath I/O is a fault tolerance technique whereby there is more than \
one physical path between the CPU in a computer system and its mass \
storage devices through the buses, controllers, switches, and bridge \
devices connecting them. \
 \
You can configure your multipathed devices with this module."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-multipath-5.0.1-1.2.noarch.rpm"
RPM_HASH = "9ac7c06d750d474a781fbd4507ee6d196a9c994d85866623956d31a9596ba03b8bfa9157c8e293f633744245985f985e31f6c422afe4827aed574740d99ab5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-multipath"

RDEPENDS:${PN} += "/usr/bin/python3 \
yast2 \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
