SUMMARY = "Tools to develop MicroOS"
DESCRIPTION = "This package contains tools to make developing of MicroOS easier."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "microos-devel-tools-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "3e4400f3575f998d1d6f8a24ade8472201420284c370002501cc6714aedd9d0887ece3ff09a7fbd3d72355e8dfe84c2557cf61ae60fd7593bc9bac6729cfd796"

RPROVIDES:${PN} += "microos-devel-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.10"

inherit rpm
