SUMMARY = "XCB utility module for client- and WM-side ICCCM helpers"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- icccm: Both client and window-manager helpers for ICCCM."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libxcb-icccm4-0.4.2-1.12.aarch64.rpm"
RPM_HASH = "33fbadb84e5fef688ce5f8ead4b7cb72c3016da9d023f8144ccc9f34e3e34aae9de3aded81581069557f2637322d1cbe24121caa8197cf2a7445330567792d24"

RPROVIDES:${PN} += "libxcb-icccm.so.4 \
libxcb-icccm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxcb.so.1"

inherit rpm
