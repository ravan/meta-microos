SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.11.17.0_1_g4f253b9b"

RPM_NAME = "qemu-seabios-11.1.11.17.0_1_g4f253b9b-1.1.noarch.rpm"
RPM_HASH = "ef17ceb723dc7eeb184f380f298b2509184f6a1d8e7d7044cfff74df1e5916616c416523d5158db930dffd3288c6d7b2eb83de0ed7950256810cb793e091152e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
