SUMMARY = "Client library for fastcgi protocol"
DESCRIPTION = "FCGI::Client is client library for fastcgi protocol."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-FCGI-Client-0.90.0-1.10.noarch.rpm"
RPM_HASH = "58e54fe48d5b6b53470fe3a702f7e09f2ce3480343ba119b15d16fabfad06c2eb13dab5a5aca81bd241d32b1fe369e1b642cbcb3eda2a2c4b78f79cd11332ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FCGI--Client \
perl-FCGI--Client--Connection \
perl-FCGI--Client--Constant \
perl-FCGI--Client--Record \
perl-FCGI--Client--RecordFactory \
perl-FCGI--Client--RecordHeader \
perl-FCGI-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-Type--Tiny"

inherit rpm
