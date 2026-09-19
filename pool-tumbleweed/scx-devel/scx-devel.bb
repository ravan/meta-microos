SUMMARY = "Development files for sched-ext"
DESCRIPTION = "Header files needed to develop a sched-ext scheduler in C."
LICENSE = "GPL-2.0-only"

PV = "1.1.3"

RPM_NAME = "scx-devel-1.1.3-1.1.noarch.rpm"
RPM_HASH = "0762a4451eb3d0ebeb2f0723f02a12b44f74357ed3483b05de9d0f10076ba8a9e1b1d2070527ce354b65135a60f50cbe85c0c51d53be821dd355b63c5e6635fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scx-devel"

RDEPENDS:${PN} += ""

inherit rpm
