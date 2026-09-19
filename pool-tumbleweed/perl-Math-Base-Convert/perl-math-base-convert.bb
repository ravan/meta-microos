SUMMARY = "Very fast base to base conversion"
DESCRIPTION = "This module provides fast functions and methods to convert between \
arbitrary number bases from 2 (binary) thru 65535. \
 \
This module is pure Perl, has no external dependencies, and is backward \
compatible with old versions of Perl 5."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.130.0"

RPM_NAME = "perl-Math-Base-Convert-0.130.0-1.5.noarch.rpm"
RPM_HASH = "fe219e77876f0741f374b19b68e78f78a5f4fa8673182df8e4432025dbf9f90b547efcaa907eea524e9e4ddc252227a0ae4b957f2d1b18e40446cfa1a59f77c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Base--Convert \
perl-Math--Base--Convert--Bases \
perl-Math--Base--Convert--Bitmaps \
perl-Math--Base--Convert--CalcPP \
perl-Math--Base--Convert--Shortcuts \
perl-Math-Base-Convert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
