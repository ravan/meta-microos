SUMMARY = "OPL2/3 FM instrument loader"
DESCRIPTION = "sbiload is an OPL2/3 FM instrument loader for ALSA hwdep."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "sbiload-0.4.0-29.4.aarch64.rpm"
RPM_HASH = "813667b22a45f9d8a82e25bb3577a5da9793d319ab5be5bd126ecf89fbcce4673fdc0067a95d63c70e11b749090557357f53f1ac5783621ed94c7ab102a7f8b0"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/sbiload \
sbiload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
