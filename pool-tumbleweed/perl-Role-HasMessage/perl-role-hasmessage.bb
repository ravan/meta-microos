SUMMARY = "Thing with a message method"
DESCRIPTION = "This is another extremely simple role. A class that includes \
Role::HasMessage is promising to provide a 'message' method that returns a \
string summarizing the message or event represented by the object. It does \
_not_ provide any actual behavior."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Role-HasMessage-0.007-1.18.noarch.rpm"
RPM_HASH = "28beeb44b5335c5a5cd44a26df4a69f035e137bfa5ffc82d764930f08d23ec6ea07171225bc0919e22cc767d51eef98385b891a3d0b847664f96b62ae6f4f246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--HasMessage \
perl-Role--HasMessage--Errf \
perl-Role-HasMessage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose--Role \
perl-MooseX--Role--Parameterized \
perl-String--Errf \
perl-Try--Tiny \
perl-namespace--clean"

inherit rpm
