SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.11.17.0_1_g4f253b9b"

RPM_NAME = "qemu-vgabios-11.1.11.17.0_1_g4f253b9b-1.1.noarch.rpm"
RPM_HASH = "415f4e9bd3971ce750b6a37deb2858ce6d03335717e7d3b976f923640a83152856c536a1e5cde2a1d8b105fd1e3321d4dd8db84740aa21b672b3a564b2da6a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"

RDEPENDS:${PN} += ""

inherit rpm
