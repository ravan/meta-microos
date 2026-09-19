SUMMARY = "Files from the contrib directory"
DESCRIPTION = "This package contains all the files from the contrib directory"
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-contrib-4.5.12-2.1.noarch.rpm"
RPM_HASH = "eba99493c8f9d31ad3a3da454085d552a3c770fd5431b2fae87b4143adea38f09cadb45ca95ccea7b84dbf34ee012d094bfa603d5339533dfec65a171abe77e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios"

inherit rpm
