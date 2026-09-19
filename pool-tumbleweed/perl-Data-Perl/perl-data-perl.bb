SUMMARY = "Base classes wrapping fundamental Perl data types"
DESCRIPTION = "Data::Perl is a collection of classes that wrap fundamental data types that \
exist in Perl. These classes and methods as they exist today are an attempt \
to mirror functionality provided by Moose's Native Traits. One important \
thing to note is all classes currently do no validation on constructor \
input. \
 \
Data::Perl is a container class for the following classes: \
 \
* * Data::Perl::Collection::Hash \
 \
* * Data::Perl::Collection::Array \
 \
* * Data::Perl::String \
 \
* * Data::Perl::Number \
 \
* * Data::Perl::Counter \
 \
* * Data::Perl::Bool \
 \
* * Data::Perl::Code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.002011"

RPM_NAME = "perl-Data-Perl-0.002011-1.29.noarch.rpm"
RPM_HASH = "f88134f3f3a1e2522958d48b038e7a5fb4ee2e9bfd1f2bba965eaf3be460034fecc64dc03582f998ce20db5ccd284daaa52ac3c0a5788be27fae1c72f52f9b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Perl \
perl-Data--Perl--Bool \
perl-Data--Perl--Code \
perl-Data--Perl--Collection--Array \
perl-Data--Perl--Collection--Hash \
perl-Data--Perl--Counter \
perl-Data--Perl--Number \
perl-Data--Perl--Role--Bool \
perl-Data--Perl--Role--Code \
perl-Data--Perl--Role--Collection--Array \
perl-Data--Perl--Role--Collection--Hash \
perl-Data--Perl--Role--Counter \
perl-Data--Perl--Role--Number \
perl-Data--Perl--Role--String \
perl-Data--Perl--String \
perl-Data-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Method--Modifiers \
perl-List--MoreUtils \
perl-Module--Runtime \
perl-Role--Tiny \
perl-parent \
perl-strictures"

inherit rpm
