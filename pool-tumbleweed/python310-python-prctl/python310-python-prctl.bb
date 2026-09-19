SUMMARY = "Python(ic) interface to the linux prctl syscall"
DESCRIPTION = "The linux prctl function allows you to control specific characteristics of a \
process' behaviour. Usage of the function is fairly messy though, due to \
limitations in C and linux. This module provides a nice non-messy python(ic) \
interface. \
 \
Besides prctl, this library also wraps libcap for complete capability handling \
and allows you to set the process name as seen in ps and top."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "python310-python-prctl-1.8.1-2.10.aarch64.rpm"
RPM_HASH = "1eb1e3bd8a90ec6c805f9ff93e66f2bf969a6b4031e3f2b0dd9e2057903dc9898e8f07db00e8f029e53ef0dbf61a4137178db2d981b3e152550db757a1429dfb"

RPROVIDES:${PN} += "python3.10dist-python-prctl \
python310-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
