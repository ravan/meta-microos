SUMMARY = "Pre-stretched versions of int10h-oldschoolpc-fonts"
DESCRIPTION = "This package contains aspect-corrected and non-corrected-but-stretched \
variants of the main font files."
LICENSE = "CC-BY-SA-4.0"

PV = "2.2"

RPM_NAME = "int10h-oldschoolpc-fonts-stretched-2.2-1.16.noarch.rpm"
RPM_HASH = "5d0d9021a7b310ce595b0bb8d4508f8c849fd2fa034c340cd10efbf9b19ed1250b112d1729bdfdf7de4065286fbbdbb59bf0745640da8317c732e7a2fac12388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-int10h-oldschoolpc-fonts-stretched \
int10h-oldschoolpc-fonts-stretched"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
