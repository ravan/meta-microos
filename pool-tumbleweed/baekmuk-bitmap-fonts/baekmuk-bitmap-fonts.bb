SUMMARY = "Baekmuk Fonts, Bitmap Version"
DESCRIPTION = "Baekmuk Fonts (Korean fonts for the X Window System, bitmap version)."
LICENSE = "HPND"

PV = "2.2"

RPM_NAME = "baekmuk-bitmap-fonts-2.2-2.7.noarch.rpm"
RPM_HASH = "dcde80ad0112f53aa29fa61650e70f147126b19bc5c4010813bdbb340d3798d331080205842686073bf17dc1ba123c5867d283db3827732ceb6dc5abdfa059c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baekmuk \
baekmuk-bitmap-fonts \
locale-xorg-x11-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
