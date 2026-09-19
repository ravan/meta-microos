SUMMARY = "Chinese (Unicode) TrueType fonts by Dr"
DESCRIPTION = "Chinese (Unicode) TrueType fonts by Dr. Hann-Tzong Wang"
LICENSE = "GPL-2.0+"

PV = "1.3.0"

RPM_NAME = "wang-fonts-1.3.0-1.25.noarch.rpm"
RPM_HASH = "7138479d02e37956d00162c0330ab11ac859e779f7a813d1f6d62fbaae681d0b637a55c1fd3633a58625c31e1002536df9565c00e2b20440319775dee4a84b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wang-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
