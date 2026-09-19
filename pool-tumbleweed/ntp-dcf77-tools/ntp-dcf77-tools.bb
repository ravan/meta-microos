SUMMARY = "DCF77 related tools"
DESCRIPTION = "DCF77 related programs. \
 \
There are currently two tools: \
  * testdcf, a simple DCF77 raw impulse test program. \
  * dcfd, a simple DCF77 raw impulse receiver with NTP loopfilter \
    mechanics for synchronisation."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p18"

RPM_NAME = "ntp-dcf77-tools-4.2.8p18-3.3.aarch64.rpm"
RPM_HASH = "94f4520aa01635b7bec94cfdcb5ad61065b5b09d98ba8cb2c9e3019bc2b4959e1dee53cc08d2ccd35b4c062265a5b2dcedb1822fb4316c875865a959b279a5bb"

RPROVIDES:${PN} += "ntp-dcf77-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
