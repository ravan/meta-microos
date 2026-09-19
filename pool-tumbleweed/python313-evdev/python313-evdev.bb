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

RPM_NAME = "python313-evdev-1.9.3-1.6.aarch64.rpm"
RPM_HASH = "36e522788c23b89cd1b8a6cf023a6984dad8611c4a45a67744f70605d9948ad89ae24eea29c12ae6bbc916d63f8a985c65feacca0c6856cdce6500b86e3fbd05"

RPROVIDES:${PN} += "python3-evdev \
python3.13dist-evdev \
python313-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
