SUMMARY = "Library of commonly used type constraints"
DESCRIPTION = "A set of commonly-used type constraints that do not ship with Moose by \
default."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001015"

RPM_NAME = "perl-MooseX-Types-Common-0.001015-1.7.noarch.rpm"
RPM_HASH = "08c36c73e3f6e30c193117669c4bb8653faab82d4faf514384a1e0afe4436e567c718eb3070bbaf44cc6673158bb96f500095aa0bca792c06f9f2ad6ecfe7ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Common \
perl-MooseX--Types--Common--Numeric \
perl-MooseX--Types--Common--String \
perl-MooseX-Types-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm
