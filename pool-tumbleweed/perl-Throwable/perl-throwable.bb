SUMMARY = "Role for classes that can be thrown"
DESCRIPTION = "Throwable is a role for classes that are meant to be thrown as exceptions \
to standard program flow. It is very simple and does only two things: saves \
any previous value for '$@' and calls 'die $self'. \
 \
Throwable is implemented with Moo, so you can stick to Moo or use Moose, as \
you prefer."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001"

RPM_NAME = "perl-Throwable-1.001-1.18.noarch.rpm"
RPM_HASH = "5eab8afbd6d68fd6a5904c53be9e796076bfccdb57afe715c1064b2cce4b8c53a7683f56a16fb5e368c54d8d5094e27a22972ac8d37d1380a46e2338b9b2e8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-StackTrace--Auto \
perl-Throwable \
perl-Throwable--Error"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--StackTrace \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Sub--Quote"

inherit rpm
