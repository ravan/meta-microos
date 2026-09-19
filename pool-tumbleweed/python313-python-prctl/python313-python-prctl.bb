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

RPM_NAME = "python313-python-prctl-1.8.1-2.10.aarch64.rpm"
RPM_HASH = "0a3cd287cb8f998a9100e88a4959216f6b4bd8c3c0b91c10ba9ed99604748d8dbb31114c6aca4916da201a1c2fb4f5519247d27e0ac02bd2b7ce99e91af9c062"

RPROVIDES:${PN} += "python3.13dist-python-prctl \
python313-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
