SUMMARY = "Parse a distribution name"
DESCRIPTION = "Parse::Distname is yet another distribution name parser. It works almost \
the same as CPAN::DistnameInfo, but Parse::Distname takes a different \
approach. It tries to extract a version part of a distribution and treat \
the rest as a distribution name, contrary to CPAN::DistnameInfo which tries \
to define a name part and treat the rest as a version. \
 \
Because of this difference, when Parse::Distname parses a weird \
distribution name such as 'AUTHOR/v1.0.tar.gz', it says the name is empty \
and the version is 'v1.0', while CPAN::DistnameInfo says the name is 'v' \
and the version is '1.0'. See test files in this distribution if you need \
more details. As of this writing, Parse::Distname returns a different \
result for about 200+ distributions among about 320000 BackPan \
distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.05"

RPM_NAME = "perl-Parse-Distname-0.05-1.18.noarch.rpm"
RPM_HASH = "7629df68f0ce744a54dda68b4c68edd6e19d542d6385061b3266088d61a69efd1222a45eeb4bd94bee2610bc2478f206273203d6bac1ba59af89a7785774cd1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Distname \
perl-Parse-Distname"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
