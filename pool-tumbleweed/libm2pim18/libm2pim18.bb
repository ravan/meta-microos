SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libm2pim18-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "2a7939484afc3e6805217cefb429cb35ba3511d2be3b9fb5b601dcabc62196d95ad3cdf976d63c40773539dc6b1ca048c513600c0499bf864eb5a7baae8f8b38"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
