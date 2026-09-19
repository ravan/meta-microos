SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "112+suse.51.gf078a84"

RPM_NAME = "dracut-ima-112+suse.51.gf078a84-1.1.aarch64.rpm"
RPM_HASH = "82e0d3342f40d887434a3b8155bef604855dbcda3bd2a2192b790906403f61292ec7eec30db36e5dc157b6ef0b09c4584e6ddaa386d8015095ca0409287b2dd5"

RPROVIDES:${PN} += "config-dracut-ima \
dracut-ima"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
