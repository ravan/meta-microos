SUMMARY = "Tibetan Font"
DESCRIPTION = "Created in 2006 by Chris Fynn, Jomolhari is an OpenType Tibetan/Bhutanese font that supports \
both the Unicode encoding for Tibetan and part A of the Chinese encoding for pre-composed \
Tibetan characters. Based on Bhutanese manuscript examples, it is in its preliminary stage \
or alpha version. This version was made for trial purposes, and its author, Chris Fynn, \
welcomes feedback."
LICENSE = "OFL-1.1"

PV = "alpha003"

RPM_NAME = "jomolhari-fonts-alpha003-3.25.noarch.rpm"
RPM_HASH = "2b270986343dbfd782902beda009e20543f622828da9f12417b90458786b5a04f83eaa65c965f8539b9b2557927e66ccddca32d6b2c6282cc722cdeefe5b645d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jomolhari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
