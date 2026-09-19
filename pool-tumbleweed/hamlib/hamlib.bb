SUMMARY = "Run-time library to control radio transcievers and receivers"
DESCRIPTION = "The Ham Radio Control Libraries (Hamlib) provide a programming \
interface for controlling radios and other shack hardware. \
It is a software layer, not a complete user application."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "hamlib-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "6bed9f36c82ce910d350b75d735159f8798c8defb4e87c57bb0c129c7ad456d1ce594b430ce9bf805732f37f69a799e91ce0ef803ec4647db5dae2e4e6d08c05"

RPROVIDES:${PN} += "hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libreadline.so.8 \
libusb-1.0.so.0"

inherit rpm
