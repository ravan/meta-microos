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

RPM_NAME = "python311-python-prctl-1.8.1-2.10.aarch64.rpm"
RPM_HASH = "7db22beae3c026252e636a56d6f4f6144f174667df3a39bd84dedfa374935557f3d0f08793cf7f36b5d1b03ce469741fa9f297309d5186262217ae41d460e4eb"

RPROVIDES:${PN} += "python3-python-prctl \
python3.11dist-python-prctl \
python311-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
