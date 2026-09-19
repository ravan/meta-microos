SUMMARY = "Retrieve terminal size"
DESCRIPTION = "This is a unified interface to retrieve terminal size. It loads one module \
of a list of known alternatives, each implementing some way to get the \
desired terminal information. This loaded module will actually do the job \
on behalf of 'Term::Size::Any'. \
 \
Thus, 'Term::Size::Any' depends on the availability of one of these \
modules: \
 \
    Term::Size           (soon to be supported) \
    Term::Size::Perl \
    Term::Size::ReadKey  (soon to be supported) \
    Term::Size::Win32 \
 \
This release fallbacks to Term::Size::Win32 if running in Windows 32 \
systems. For other platforms, it uses the first of Term::Size::Perl, \
Term::Size or Term::Size::ReadKey which loads successfully. (To be honest, \
I disabled the fallback to Term::Size and Term::Size::ReadKey which are \
buggy by now.)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Term-Size-Any-0.002-1.26.noarch.rpm"
RPM_HASH = "baee038c34d42a044ed2f530288d9183237edaa89281aa65bf27f00cfd8e339b14e0beff4ed79eb33b6fb52d1e8973678d4e01185b26ab91a3ad2d6af48e0cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Any \
perl-Term-Size-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Hide \
perl-Module--Load--Conditional \
perl-Term--Size--Perl"

inherit rpm
