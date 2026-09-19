SUMMARY = "Meetei Mayek Unicode Font"
DESCRIPTION = "Eeyek Unicode TrueType Font allows you to read and write in Meetei Mayek script."
LICENSE = "GPL-2.0+"

PV = "20091204"

RPM_NAME = "eeyek-fonts-20091204-3.25.noarch.rpm"
RPM_HASH = "051e6e7aaaf8639698da86272f1c7adf20fa62876c6521a4b0b6060ecda4d2f3f9d562a9849f478404156c64ba8b6d549bbe4891ed7f3ce5728da4c865f971cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eeyek-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
