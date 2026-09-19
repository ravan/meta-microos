SUMMARY = "Contains the needed services for tftpboot-installation"
DESCRIPTION = "This packages contains all the files and services which are needed to \
mount the tftpboot-installation images into the /srv/tftpboot directory."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "tftpboot-installation-common-1.1-1.20.noarch.rpm"
RPM_HASH = "1b5fe7e13582bda274012b608d30e81a74ba30eafbd7ccce24b8cc001bee6a9133bf351f44a56e92ab2d2cae53a6d7ce864f30b429f35d34fbebb4063deaa88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-common"

RDEPENDS:${PN} += "/usr/bin/sh \
tftp"

inherit rpm
