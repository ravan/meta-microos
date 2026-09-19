SUMMARY = "Support for creating standard 'inside-out' classes"
DESCRIPTION = "This module provides tools that help to implement the 'inside out object' \
class structure in a convenient and standard way. \
 \
_Portions of the following code and documentation from 'Perl Best \
Practices' copyright (c) 2005 by O'Reilly Media, Inc. and reprinted with \
permission._"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Class-Std-0.013-1.40.noarch.rpm"
RPM_HASH = "f71e147efe2f2fef41be8ed949c00f1d859a62b432afed5d39cb41f73fa14345b5d6349587830aa964682523984cb7a750bd87422c6d4b7e0e61684693c66feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Std \
perl-Class--Std--SCR \
perl-Class-Std"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
