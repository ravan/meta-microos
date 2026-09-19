SUMMARY = "Declarative Validation of Data Structures"
DESCRIPTION = "The main purpose of this module is to provide an easy way to build a \
profile to validate a data structure. It does this by giving you a set of \
declarative keywords in the importing namespace."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Declare-Constraints-Simple-0.03-16.36.noarch.rpm"
RPM_HASH = "74db63c63c0087c10e664e96aa668a7dacf3b456bda13d2f27ff3ec2023b2e064128659776118e2b9c75bb6558adfde669bf514541208d7d8d7126c931df633d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Declare--Constraints--Simple \
perl-Declare--Constraints--Simple--Library \
perl-Declare--Constraints--Simple--Library--Array \
perl-Declare--Constraints--Simple--Library--Base \
perl-Declare--Constraints--Simple--Library--Exportable \
perl-Declare--Constraints--Simple--Library--General \
perl-Declare--Constraints--Simple--Library--Hash \
perl-Declare--Constraints--Simple--Library--Numerical \
perl-Declare--Constraints--Simple--Library--OO \
perl-Declare--Constraints--Simple--Library--Operators \
perl-Declare--Constraints--Simple--Library--Referencial \
perl-Declare--Constraints--Simple--Library--Scalar \
perl-Declare--Constraints--Simple--Result \
perl-Declare-Constraints-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp--Clan \
perl-Class--Inspector \
perl-aliased"

inherit rpm
