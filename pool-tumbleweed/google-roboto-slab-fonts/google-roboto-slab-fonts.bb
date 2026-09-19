SUMMARY = "Neo-grotesque sans-serif typeface family"
DESCRIPTION = "Roboto is Google’s signature family of fonts, the default font on Android and \
Chrome OS, and the recommended font for Google’s visual language, Material Design. \
 \
The font family supports all Latin, Cyrillic, and Greek characters in Unicode 7.0, \
as well as the currency symbol for the Georgian lari, to be published in Unicode 8.0. \
 \
The fonts are currently available in eighteen different styles."
LICENSE = "Apache-2.0"

PV = "0~git20200304"

RPM_NAME = "google-roboto-slab-fonts-0~git20200304-1.17.noarch.rpm"
RPM_HASH = "a93edaa5c3c76d9d0289edcb448f4611efba2dcd812c757cf60c47abd55fcf1041d8ff78e3b1efc409634737c6f0adea3eefdc3ee501e9b615dd7254f347b167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-fonts-/usr/share/appdata/google-roboto-slab.metainfo.xml \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Black.ttf \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Bold.ttf \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Light.ttf \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Medium.ttf \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Regular.ttf \
google-roboto-fonts-/usr/share/fonts/truetype/RobotoSlab-Thin.ttf \
google-roboto-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
