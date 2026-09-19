SUMMARY = "Monospace CJK-Unicode fonts with a Ming (Serif) style"
DESCRIPTION = "This font was taken from the from the TrueType fonts generously \
released by Arphic Technologies Taiwan under the Arphic Public License. \
It was modified with Fontforge by Arne Goetje <arne@linux.org.tw> to \
contain both Big5 and GB2312 charsets plus some european characters. \
 \
Currently it fully supports the following charsets: \
ISO8859-1,2,3,4,9,10,13,14,15 Big5 GB2312-80 HKSCS 2004 Bopomofo \
Extensions for Hakka, Minnan (Unicode 4.0) and MBE variants using the \
Alternatives (aalt) feature from the OTF spec. \
 \
Partly support is implemented for: CNS 11643 GB18030 Japanese Korean"
LICENSE = "Arphic-1999"

PV = "0.2.20080216.1"

RPM_NAME = "arphic-uming-fonts-0.2.20080216.1-101.3.noarch.rpm"
RPM_HASH = "03ebdff8bd8b8fcfa242a172cbf0c0799aac50082db9de15a1e37dae6257967104749fbc7746b7f8bc0afd2868ce58446c8426a7b0f5e3dc86914ce1b12f8859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-uming-fonts \
scalable-font-zh-CN \
scalable-font-zh-HK \
scalable-font-zh-MO \
scalable-font-zh-SG \
scalable-font-zh-TW \
ttf-arphic-uming"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
