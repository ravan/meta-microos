SUMMARY = "Designate Tests Only Run by Module Authors"
DESCRIPTION = "designate tests only run by module authors"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Module-Install-AuthorTests-0.002-1.43.noarch.rpm"
RPM_HASH = "81801d04b7ee4ddc62671564458772d0d279a922404f2d94f301063330c4116a1d7909eaa029bbb307ee7346d164fddc9cedc7877f8571e617e0b7bdc22fcb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--AuthorTests \
perl-Module-Install-AuthorTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Install"

inherit rpm
