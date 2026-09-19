SUMMARY = "Pythonified linux asm-generic/ioctl.h"
DESCRIPTION = "Functions to compute fnctl.ioctl's opt argument."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "python313-ioctl-opt-1.3.1-1.2.noarch.rpm"
RPM_HASH = "09d6edb48d6ff62671e0f44556bbb8faf0fc6ff2305c253650b903e4e5f0f6d5f91bb197f126296916f088fc9206d7a850605c72cd04dbc88dfe01e718b00eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ioctl-opt \
python3.13dist-ioctl-opt \
python313-ioctl-opt \
python3dist-ioctl-opt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
