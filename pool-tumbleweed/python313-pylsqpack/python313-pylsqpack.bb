SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.24"

RPM_NAME = "python313-pylsqpack-0.3.24-1.4.aarch64.rpm"
RPM_HASH = "2428fe12884e374f706a5f7f42a48ca68b5144a78c5d25ea353186444d7fd237e12e386df07705818153155b4cb7c900978ff0a06e45590a588a2f54de7e9c33"

RPROVIDES:${PN} += "python3-pylsqpack \
python3.13dist-pylsqpack \
python313-pylsqpack \
python3dist-pylsqpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
