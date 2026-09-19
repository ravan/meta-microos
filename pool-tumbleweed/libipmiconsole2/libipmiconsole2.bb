SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmiconsole library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "libipmiconsole2-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "42eb40d3b49f77ba9648837c7ae42e8b1830bf5bd045d35c7481a1f832075d991b04e4c756868d5798d09ef0e764df9a380749176a18ae70b2ccdacc33759ba9"

RPROVIDES:${PN} += "libipmiconsole.so.2 \
libipmiconsole2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17"

inherit rpm
