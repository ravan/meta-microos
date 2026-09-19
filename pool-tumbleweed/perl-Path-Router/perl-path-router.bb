SUMMARY = "Tool for Routing Paths"
DESCRIPTION = "This module provides a way of deconstructing paths into parameters suitable \
for dispatching on. It also provides the inverse in that it will take a \
list of parameters, and construct an appropriate uri for it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Path-Router-0.15-1.39.noarch.rpm"
RPM_HASH = "c2eefdf2b17463a6725ecd5303b1f7f7e8575673008a9b0079980aca84fda9cb3ecc4ae97a6ed633b14ca21aca237d72d333ec356995ea59a9dc3e5222209219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--Router \
perl-Path--Router--Route \
perl-Path--Router--Route--Match \
perl-Path--Router--Shell \
perl-Path--Router--Types \
perl-Path-Router \
perl-Test--Path--Router"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Clone--PP \
perl-Data--Dumper \
perl-Eval--Closure \
perl-File--Spec--Unix \
perl-Moo \
perl-Sub--Exporter \
perl-Term--ReadLine \
perl-Test--Builder \
perl-Test--Deep \
perl-Try--Tiny \
perl-Type--Tiny \
perl-Types--Standard \
perl-constant \
perl-namespace--clean"

inherit rpm
