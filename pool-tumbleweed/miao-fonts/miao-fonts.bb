SUMMARY = "Miao Unicode Fonts"
DESCRIPTION = "Miao Unicode is an open-source, Graphite enabled font which \
supports the Miao, or ‘Pollard’, script."
LICENSE = "OFL-1.1"

PV = "20131031"

RPM_NAME = "miao-fonts-20131031-3.25.noarch.rpm"
RPM_HASH = "7702a294004d8114f667972f8815b58765d206dec17a903cfec63a2f6c70cb333c430961ade04d7136da6aeda632521a7ebc9dbea5a268688d9df9054c0cd434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "miao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
