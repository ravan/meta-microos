SUMMARY = "Expand crontab(5)-style integer lists"
DESCRIPTION = "Set::Crontab parses crontab-style lists of integers and defines some \
utility functions to make it easier to deal with them. \
 \
 \
 \
Authors: \
-------- \
    Abhijit Menon-Sen <ams@wiw.org>"
LICENSE = "Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-Set-Crontab-1.03-20.46.aarch64.rpm"
RPM_HASH = "7f2ce4dfb9bd89e3bdb57cb2f44abf52f9722b5d1e4e7008facbf49ad58964e201cde6f5d14cf039b710e17c9a0407f99fc1c2dbbe070aba5e152c9c454acbea"

RPROVIDES:${PN} += "perl-Set--Crontab \
perl-Set-Crontab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
