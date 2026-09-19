SUMMARY = "Korean TrueType fonts"
DESCRIPTION = "Collection of Korean TrueType fonts."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.20080608"

RPM_NAME = "un-fonts-1.0.20080608-12.3.noarch.rpm"
RPM_HASH = "13272b587ef161f05f9526dffe7054c02796c0aebcd4722e718a5bd589c8a6a1fcc89cbeceb97dd5905bc489d199b059880b4754b72dd2e3916409f2bbd3bed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scalable-font-ko \
un-fonts \
unfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
