SUMMARY = "A frontend for the 'duplicity' backup program"
DESCRIPTION = "A shell front end to duplicity that simplifies the usage by managing \
settings for backup jobs in profiles. It supports executing multiple \
commands in a batch mode to enable single line cron entries and executes \
pre/post backup scripts."
LICENSE = "GPL-2.0-only"

PV = "2.5.6"

RPM_NAME = "duply-2.5.6-1.2.noarch.rpm"
RPM_HASH = "713327a12b9516f657b2339101d05c295121dfd52d168c00e4a53988b92367d88f966d1c8a1693e76f8947d51a0c7edc2546272ff22044ed06e30b0ffcb1fe9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duply"

RDEPENDS:${PN} += "/usr/bin/bash \
duplicity"

inherit rpm
