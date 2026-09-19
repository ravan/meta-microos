SUMMARY = "Tool to inspect RP2040 binaries"
DESCRIPTION = "Picotool is a tool for inspecting RP2040 binaries, and interacting with RP2040 devices when they are in BOOTSEL mode."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "picotool-2.1.1-1.6.aarch64.rpm"
RPM_HASH = "95ff69d4430af876a70f54e71a39ba8b424a295b3c8b98845d7fb7a084737e818d370351da58763886283d0eec78ce341c66844b1f49e190916aec5fe07bc2ad"

RPROVIDES:${PN} += "cmake-picotool \
picotool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
