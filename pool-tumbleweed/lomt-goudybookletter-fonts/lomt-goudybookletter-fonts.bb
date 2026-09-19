SUMMARY = "League Of Movable Type's 'Goudy Bookletter 1911' font"
DESCRIPTION = "A serif font based on Frederic Goudy's Kennerley Oldstyle."
LICENSE = "SUSE-Public-Domain"

PV = "0.20121218"

RPM_NAME = "lomt-goudybookletter-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "9e93c403435e9eb82ae32f699e40ac1ae29d6c45d26bb94046911a5d08bf99a5daeeaff606346c8ab0463ba4dcb46cf0d1fd49c8cea6603091a57aee60b701bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-goudybookletter-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
