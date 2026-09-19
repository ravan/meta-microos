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

RPM_NAME = "python312-python-prctl-1.8.1-2.10.aarch64.rpm"
RPM_HASH = "f7c722c0a434deca7e19770873825c339d17dd04b1ad68c3aa113767c3463435b2820a3c0120439b32a1f2d1631cbda76278294e06d2a1ee6587228770a7549f"

RPROVIDES:${PN} += "python3.12dist-python-prctl \
python312-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
