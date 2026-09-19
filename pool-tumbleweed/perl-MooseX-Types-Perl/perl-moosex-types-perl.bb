SUMMARY = "Moose types that check against Perl syntax"
DESCRIPTION = "This library provides Moose types for checking things (mostly strings) \
against syntax that is, or is a reasonable subset of, Perl syntax."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.101344"

RPM_NAME = "perl-MooseX-Types-Perl-0.101344-1.18.noarch.rpm"
RPM_HASH = "0cad53c9075af422a5174cf10ea4cb55140fbd559a2bdf80a696b6b3ae212ae2d300df8fbfccbe7c953576f88e599f2db4f8cfefef109b044681784a08e57c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Perl \
perl-MooseX-Types-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Params--Util \
perl-version"

inherit rpm
