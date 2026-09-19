SUMMARY = "X current working directory"
DESCRIPTION = "xcwd is a simple tool which print the current working directory of the currently focused window."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "xcwd-1.0-1.20.aarch64.rpm"
RPM_HASH = "e2ec5c35993e966981ea69f715a4da19e958be232ab8b21c7c234cdf86a226b0a192377797f0b9011b2b7e4366e8b5386591acc87b772c0f4775b65e362ce821"

RPROVIDES:${PN} += "xcwd"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
