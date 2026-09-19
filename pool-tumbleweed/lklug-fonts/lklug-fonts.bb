SUMMARY = "'Lanka Linux User Group' OpenType Font for Sinhala"
DESCRIPTION = "'Lanka Linux User Group' OpenType font for Sinhala copyright 2004 by \
Yannis Haralambous.  OTF tables added by Anuradha Ratnaweera an d \
Harshani Devadithya, and modified by Harshula Jayasuriya. 'Kunddaliya' \
glyph Copyright (c) 2006 Harshula Jayasuriya"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "lklug-fonts-0.6-120.25.noarch.rpm"
RPM_HASH = "5229460b268bb4d108127b694c7522717135b6c2e45261c6f7f3dbcf152cc21c98aaa0d9f5474a6acb635174a170f098b765fdfc83396aeb1eee5b820b2a614e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lklug \
lklug-fonts \
locale-si \
scalable-font-si"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
