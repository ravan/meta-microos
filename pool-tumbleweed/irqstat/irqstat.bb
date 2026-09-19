SUMMARY = "Script to better monitor interrupts in large systems"
DESCRIPTION = "A better way to watch /proc/interrupts, designed for NUMA systems with many processors."
LICENSE = "MIT"

PV = "1.0.0+git4cd6854"

RPM_NAME = "irqstat-1.0.0+git4cd6854-2.7.noarch.rpm"
RPM_HASH = "471d8e7696376f0b4c189e419dd72ca12d00ab8144e2ceb694403bd56782ab2459f4cb400f597746da847e5f92ba23f0bab7cc343a63e3cfb5d1574556b1b188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "irqstat"

RDEPENDS:${PN} += "/usr/bin/python3 \
numactl"

inherit rpm
