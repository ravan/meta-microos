SUMMARY = "Perl implementation of the 'Adapter' Design Pattern"
DESCRIPTION = "The 'Class::Adapter' class is intended as an abstract base class for \
creating any sort of class or object that follows the _Adapter_ pattern."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-Class-Adapter-1.09-1.33.noarch.rpm"
RPM_HASH = "78909aa43be186d9db4b36d659a8b10c9d895b81d2172ab728938d28017a897b0b4cf0a59d151cd99742f8f1e554dcb80921fb858485a78826be35410684f4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Adapter \
perl-Class--Adapter--Builder \
perl-Class--Adapter--Clear \
perl-Class-Adapter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
