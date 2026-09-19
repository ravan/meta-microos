SUMMARY = "Basic method declarations with signatures, without source filters"
DESCRIPTION = "Basic method declarations with signatures, without source filters"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Method-Signatures-Simple-1.07-1.41.noarch.rpm"
RPM_HASH = "27ead515496daf9e93fe3822f71e22d315c41fb9cd9342bfc6e327c33d8fab89d6355c6dad8062b2b55d1b2adabc5d0701b51300874e425f54e3bef0002007c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Signatures--Simple \
perl-Method-Signatures-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Declare"

inherit rpm
