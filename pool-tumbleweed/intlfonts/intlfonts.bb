SUMMARY = "Documentation for the International Fonts"
DESCRIPTION = "This package contains the READMEs for international fonts from the \
following packages: \
 \
intlfonts-arabic-bitmap-fonts: Arab fonts for X11 \
 \
intlfonts-asian-bitmap-fonts: Asian fonts for X11 \
 \
intlfonts-chinese-bitmap-fonts: Chinese fonts for X11 \
 \
intlfonts-ethiopic-bitmap-fonts: Ethiopic fonts for X11 \
 \
intlfonts-euro-bitmap-fonts: European fonts for X11 \
 \
intlfonts-japanese-bitmap-fonts: Japanese fonts for X11 \
 \
intlfonts-japanese-big-bitmap-fonts: Big Japanese fonts for X11 \
 \
intlfonts-phonetic-bitmap-fonts: IPA fonts for X11 \
 \
intlfonts-ttf-fonts: TrueType fonts \
 \
intlfonts-type1-fonts: Type1 fonts \
 \
intlfonts-bdf-fonts: Bitmap fonts useful for printing exotic languages from \
Emacs"
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "e539f59f0cd94d0c185340925f4e12d5198153bf8a29bb2c53160445cc84597c3676ea41fad63df2a3da2f61e245272cf5a1d6881d750a699f86182f310f2e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfnts \
intlfonts"

RDEPENDS:${PN} += "aaa-base \
coreutils \
perl"

inherit rpm
