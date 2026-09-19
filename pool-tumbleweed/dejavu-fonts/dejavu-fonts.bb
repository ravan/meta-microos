SUMMARY = "DejaVu Truetype Fonts"
DESCRIPTION = "The DejaVu fonts are a font family based on the Bitstream Vera Fonts. \
Its purpose is to provide a wider range of characters while maintaining \
the original look and feel through the process of collaborative \
development."
LICENSE = "SUSE-Permissive"

PV = "2.37"

RPM_NAME = "dejavu-fonts-2.37-2.3.noarch.rpm"
RPM_HASH = "7a9c125d56b7b1cefa85c0469f2bdcbd4b0ab543febe518a9e6259c3ece729a65df911ce497569447575635c6a5bceadef7d7bdc7ebfc37e00eca4051545639c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dejavu \
dejavu-fonts \
desktop-data-SuSE-/usr/X11R6/lib/X11/fonts/truetype/SUSESans-Roman.ttf \
locale-bg;el;mk;ru;vi"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
