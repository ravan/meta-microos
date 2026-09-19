SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0-only"

PV = "1.8.1"

RPM_NAME = "python314-pynput-1.8.1-1.5.noarch.rpm"
RPM_HASH = "628875ead6d68c04fb888b89a4f4cd12cc176042da35178300ae3b89b5668c021ee2686a0b29d7bd9ea20e4a4f9375d1ab0b1ffe1b76a5dfed1ac1335dd2577c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynput \
python314-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python314-evdev \
python314-six"

inherit rpm
