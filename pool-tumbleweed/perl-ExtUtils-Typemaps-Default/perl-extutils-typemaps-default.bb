SUMMARY = "A set of useful typemaps"
DESCRIPTION = "'ExtUtils::Typemaps::Default' is an 'ExtUtils::Typemaps' subclass that \
provides a set of default mappings (in addition to what perl itself \
provides). These default mappings are currently defined as the combination \
of the mappings provided by the following typemap classes which are \
provided in this distribution: \
 \
the ExtUtils::Typemaps::ObjectMap manpage, the ExtUtils::Typemaps::STL \
manpage, the ExtUtils::Typemaps::Basic manpage"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-ExtUtils-Typemaps-Default-1.05-3.40.noarch.rpm"
RPM_HASH = "96066588d2d38e09212a2402614d7f030fbb6d94d80a6d8e6f9045624432d3fae2d68fefaacc379239376f47fbfdd561fa31d0f24ba66bd81e3e95e04ec0e6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Typemap--Basic \
perl-ExtUtils--Typemap--Default \
perl-ExtUtils--Typemap--ObjectMap \
perl-ExtUtils--Typemap--STL \
perl-ExtUtils--Typemap--STL--String \
perl-ExtUtils--Typemap--STL--Vector \
perl-ExtUtils--Typemaps--Basic \
perl-ExtUtils--Typemaps--Default \
perl-ExtUtils--Typemaps--ObjectMap \
perl-ExtUtils--Typemaps--STL \
perl-ExtUtils--Typemaps--STL--List \
perl-ExtUtils--Typemaps--STL--String \
perl-ExtUtils--Typemaps--STL--Vector \
perl-ExtUtils-Typemaps-Default"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--Typemaps"

inherit rpm
