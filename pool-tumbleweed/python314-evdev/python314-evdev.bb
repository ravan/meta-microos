SUMMARY = "Python bindings to the Linux input handling subsystem"
DESCRIPTION = "python-evdev provides bindings to the generic input event interface \
in Linux. The evdev interface serves the purpose of passing events \
generated in the kernel directly to userspace through character \
devices that are typically located in /dev/input/. \
 \
This package also comes with bindings to uinput, the userspace input \
subsystem. Uinput allows userspace programs to create and handle \
input devices that can inject events directly into the input \
subsystem."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "python314-evdev-1.9.3-1.6.aarch64.rpm"
RPM_HASH = "52a637c268b134e5f8c0dad26d198229b42b9b3dbfec7df6e20d2fcea4b882692ac2a3f6f9918b8d58d52ece83b9298ccc004acb9b70050a56a786b8d3af4b54"

RPROVIDES:${PN} += "python3.14dist-evdev \
python314-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
