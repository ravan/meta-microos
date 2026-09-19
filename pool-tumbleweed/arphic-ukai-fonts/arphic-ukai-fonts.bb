SUMMARY = "CJK Unicode Font Kai Style"
DESCRIPTION = "This font was taken from the from the TrueType fonts generously \
released by Arphic Technologies Taiwan under the Arphic Public License. \
It was modified with Fontforge by Arne Goetje <arne@linux.org.tw> to \
contain both Big5 and GB2312 charsets plus some european characters. \
 \
Currently it fully supports the following charsets: \
ISO8859-1,2,3,4,7,9,10,13,14,15 Big5 GB2312-80 Bopomofo Extensions for \
Hakka, Minnan (Unicode 4.0) and MBE variants using the Stylistic \
Alternatives (salt) feature from the OTF spec. \
 \
Partly support is implemented for: HKSCS CNS 11643 GB18030 Japanese \
Korean"
LICENSE = "Arphic-1999"

PV = "0.2.20080216.1"

RPM_NAME = "arphic-ukai-fonts-0.2.20080216.1-101.3.noarch.rpm"
RPM_HASH = "733827ff7134983fde5ba7d3e6ce3cf3c8d0957837bb256901042976f76d5352d9058856157d7be72248850169a06272c4431c958db0160cda2fecd41f8aa17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-ukai-fonts \
locale-zh-TW;zh-HK;zh-CN;zh-SG;zh-MO \
scalable-font-zh-CN \
scalable-font-zh-HK \
scalable-font-zh-MO \
scalable-font-zh-SG \
scalable-font-zh-TW \
ttf-arphic-ukai"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
