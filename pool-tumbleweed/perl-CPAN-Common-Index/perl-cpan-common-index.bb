SUMMARY = "Common library for searching CPAN modules, authors and distributions"
DESCRIPTION = "This module provides a common library for working with a variety of CPAN \
index services. It is intentionally minimalist, trying to use as few \
non-core modules as possible. \
 \
The 'CPAN::Common::Index' module is an abstract base class that defines a \
common API. Individual backends deliver the API for a particular index. \
 \
As shown in the SYNOPSIS, one interesting application is multiplexing -- \
using different index backends, querying each in turn, and returning the \
first result."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-CPAN-Common-Index-0.010-1.26.noarch.rpm"
RPM_HASH = "5f930de86273e59c4c884cb88e5ee3532dac2314dc8de55a7da170eb7905872f2fc6fe2dfa4b297b070aafbb001f7b08281be2686761c1301c1466c6c8b4a371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Common--Index \
perl-CPAN--Common--Index--LocalPackage \
perl-CPAN--Common--Index--MetaDB \
perl-CPAN--Common--Index--Mirror \
perl-CPAN--Common--Index--Mux--Ordered \
perl-CPAN-Common-Index"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta--YAML \
perl-Class--Tiny \
perl-File--Fetch \
perl-File--Temp \
perl-HTTP--Tiny \
perl-Module--Load \
perl-Search--Dict \
perl-Tie--Handle--SkipHeader \
perl-URI \
perl-parent"

inherit rpm
