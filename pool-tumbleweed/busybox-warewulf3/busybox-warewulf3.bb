SUMMARY = "Static version of Busybox - for building Warewulf3"
DESCRIPTION = "This version of busybox is only for building Warewulf3 \
https://github.com/warewulf/warewulf3"
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-warewulf3-1.38.0-2.1.aarch64.rpm"
RPM_HASH = "ff7c22f3033770297a2b2ae3e10b05fb5ecd1988b622fa67b6eaea82f1064ee326e5ad727bf8252fc6883415e74d8291c4633e623e8bed3b36e87f4a3c5a34cb"

RPROVIDES:${PN} += "busybox-warewulf3"

RDEPENDS:${PN} += ""

inherit rpm
