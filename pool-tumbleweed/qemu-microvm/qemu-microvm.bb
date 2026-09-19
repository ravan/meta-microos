SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-microvm-11.1.1-1.1.noarch.rpm"
RPM_HASH = "4b6047e4160e4bee5a2cce4825125d6c5ed263eb9e4dffe86b2a8ea6fd642b3ff79930eafc44e15266667f89107660b76eb5af529553d8e779833dafad299a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"

RDEPENDS:${PN} += ""

inherit rpm
