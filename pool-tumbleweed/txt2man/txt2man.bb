SUMMARY = "Convert Flat ASCII Text to man Page Format"
DESCRIPTION = "Txt2man converts flat ASCII text to man page format. It is a shell \
script using gnu awk, that should run on any Unix like system."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "txt2man-1.7.1-1.16.noarch.rpm"
RPM_HASH = "14c12b19263f04f725310bfde5b36729784f6652c475b529dd51219191a902873402e1fbcd3c9ff9e611d0513ac0f76c195048d238796f94a172725b13d77531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "txt2man"

RDEPENDS:${PN} += "/usr/bin/sh \
gawk"

inherit rpm
