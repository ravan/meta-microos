SUMMARY = "A xkb layout generator script for Sway based on localectl"
DESCRIPTION = "Generate a Sway keyboard configuration block with the xkb_* options \
corresponding to the XKB* variables found in /etc/vconsole.conf."
LICENSE = "MIT"

PV = "0.0.1+git20251204.58fbdcb"

RPM_NAME = "sway-xkb-layout-generator-0.0.1+git20251204.58fbdcb-1.3.noarch.rpm"
RPM_HASH = "24f44a798dc1c5e0cacd78ecd4ed71480acce233f20a7ba4da214d3e069a6fbec3bf2a8040c14e75aed6d099d1f755a64c627440d21feb040b325b6f4bbbe2ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sway-xkb-layout-generator"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
systemd \
udev"

inherit rpm
