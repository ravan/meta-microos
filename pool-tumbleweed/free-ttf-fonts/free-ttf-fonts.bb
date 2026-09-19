SUMMARY = "Free TrueType Art Fonts"
DESCRIPTION = "More than 300 free fonts in True Type format. Most of them are in the \
art style and unusable as desktop fonts, but are great for any poster \
or illustration. \
 \
The fonts are copyrighted under the GPL or a Freeware license, but \
donations are requested by the artists. Look in \
/usr/share/doc/packages/free-ttf-fonts/ for further information."
LICENSE = "Artistic-1.0 & GPL-2.0+ & SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "free-ttf-fonts-1.0-366.25.noarch.rpm"
RPM_HASH = "585fc56e58629447cda24f7862426b62966b8c542dc042a8f7b82044d2478b24da040c64dd3df112dc29f8863a370b64b72c73e240f86d7f5a9dd84634ba53f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "free-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
