SUMMARY = "European fonts for the X Window System"
DESCRIPTION = "European fonts for the X Window System (ISO 8859-1, 8859-2, 8859-3, \
8859-4, 8859-5/9, 8859-7, and 8859-8 together with \
KOI8-1/GOST19768.74-1)."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-euro-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "94ee466937a5d862b60c08365567a72182b6850080890d1a3b3e8d4abc30be58d41a47a8a56d3f3ffe6018b9fb61c121bb251709337d62b57dd2cbb3a0ab18e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifnteuro \
intlfonts-euro-bitmap-fonts \
locale-xorg-x11-cs;el"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
