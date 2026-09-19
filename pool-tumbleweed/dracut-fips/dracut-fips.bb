SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "112+suse.51.gf078a84"

RPM_NAME = "dracut-fips-112+suse.51.gf078a84-1.1.aarch64.rpm"
RPM_HASH = "8059ca84ed2fe5962fddc03b379370ef2bf73af85aec63ac8d67859820b6b014edef4d8ff0705c00cecd6131ae119065a2da2cec27798b6b0a8eea9c42e525aa"

RPROVIDES:${PN} += "config-dracut-fips \
dracut-fips"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
libkcapi-tools"

inherit rpm
