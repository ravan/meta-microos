SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "delayacct-utils-rebuild-7.2.5-32.132.aarch64.rpm"
RPM_HASH = "8a908397643c577c4b82de2a24a3ec71613901c0c084448f101899d6b6d557741b649c58b4dbbb07d2ece99ed3f703ab6019b73310a1a9f19bbdcce18831ab05"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
