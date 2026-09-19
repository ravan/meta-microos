SUMMARY = "SIL Limbu Font"
DESCRIPTION = "Namdhinggo is a Unicode Limbu font for this elegant writing system of Nepal. \
It provides glyphs for the full range of Limbu characters (U+1900..U+194F) \
as well as basic Latin."
LICENSE = "OFL-1.1"

PV = "3.100"

RPM_NAME = "namdhinggo-fonts-3.100-1.2.noarch.rpm"
RPM_HASH = "c3d5c85116c5413b7cf5af65f14bb343d956cfb0e75b3a9746094311a75dd7e24a4a908ee9a274953c7d367d48e27aaf17ba2fce8c3a56d93798f6af4c9cd947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "namdhinggo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
