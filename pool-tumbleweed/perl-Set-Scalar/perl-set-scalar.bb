SUMMARY = "Basic Set Operations"
DESCRIPTION = "basic set operations"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.29"

RPM_NAME = "perl-Set-Scalar-1.29-1.43.noarch.rpm"
RPM_HASH = "46f33769841e5e2274503e4f28c6c064efac41434177ea5bd4b747d264684ce19086199d57d1b618cc30bfdfe31a2b511642d4c91215cdf8b4e130bf3950e490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--Scalar \
perl-Set--Scalar--Base \
perl-Set--Scalar--Null \
perl-Set--Scalar--Real \
perl-Set--Scalar--Universe \
perl-Set--Scalar--Valued \
perl-Set--Scalar--ValuedUniverse \
perl-Set--Scalar--Virtual \
perl-Set-Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
