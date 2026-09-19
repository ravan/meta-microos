SUMMARY = "Pagul Fonts"
DESCRIPTION = "Pagul is a Free Font for Sourashtra Language with Unicode glyphs."
LICENSE = "SUSE-GPL-3.0-with-font-exception"

PV = "1.0"

RPM_NAME = "pagul-fonts-1.0-3.25.noarch.rpm"
RPM_HASH = "21c9f9306137bbdc4818d59e459734cd25d951a8ec86685628c435eef956227d8411df99761d4eae319ba482fcf7b3383d38985c89fcbda7ea0c97556c983a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagul-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
