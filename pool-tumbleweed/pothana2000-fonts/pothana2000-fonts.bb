SUMMARY = "OpenType Font for Telugu"
DESCRIPTION = "Free OpenType font for Telugu created by Dr. Tirumala Krishna \
Desikacharyulu"
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "pothana2000-fonts-1.1-147.25.noarch.rpm"
RPM_HASH = "f803bdf4217ffdbbc8cefb9bf1a716e2190858197a60e6fd895ed8c9dcb1083cea57553a5723d3217946eb66837b9bcd6f11521d33d88c4157e3fc781e2bf676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-te \
pothana2000 \
pothana2000-fonts \
scalable-font-te"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
