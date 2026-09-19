SUMMARY = "OpenEXR interface to CTL"
DESCRIPTION = "	IlmImfCtl provides a simplified OpenEXR interface to the Color Transformation Language."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "libIlmImfCtl1_5-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "4ef216cf539347736cc11f89fa610151f6c25c161a2c7d8fd6065ae2b7766b13460e3c332e36e880ff4dcf3e09be0f3730e9bfbcd23d690cc552c95c96c881cc"

RPROVIDES:${PN} += "libIlmImfCtl.so.1.5 \
libIlmImfCtl1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ctl-data \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libIlmCtl.so.1.5 \
libIlmThread-3-4.so.33 \
libOpenEXR-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
