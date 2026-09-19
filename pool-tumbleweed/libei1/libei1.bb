SUMMARY = "Library for emulated input in Wayland"
DESCRIPTION = "libei is a library to send Emulated Input (EI) to a matching Emulated \
Input Server (EIS) which can receive those events with libeis. \
 \
It targets Wayland and provides separation, distinction and control, \
which, for comparison, are not available with XTEST (X11's emulated \
input)."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libei1-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "eea3390ccd5557ffa62541b9c6210dcdb46e2b73dec963f3a7ec557095bbe82a89d837cb461de04220820650a4cef175f8fac9bab74c346f2e98de7f78155b4d"

RPROVIDES:${PN} += "libei.so.1 \
libei1 \
libeis.so.1 \
liboeffis.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
