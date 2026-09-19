SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "b54dc3e4aae52244c986894d1d7e150801961a8145e0c434fda07b70da89e11146a8eef176debdc091b125f00a21cd51c3b6394d663984dc1ab56b2a393c1105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-fade-throbber \
plymouth-plugin-label \
plymouth-scripts"

inherit rpm
