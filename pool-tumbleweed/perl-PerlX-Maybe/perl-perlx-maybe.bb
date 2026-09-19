SUMMARY = "Return a pair only if they are both defined"
DESCRIPTION = "Moose classes (and some other classes) distinguish between an attribute \
being unset and the attribute being set to undef. Supplying a constructor \
arguments like this: \
 \
 my $bob = Person->new( \
    name => $name, \
    age => $age, \
 ); \
 \
Will result in the 'name' and 'age' attributes possibly being set to undef \
(if the corresponding '$name' and '$age' variables are not defined), which \
may violate the Person class' type constraints. \
 \
(Note: if you are the _author_ of the class in question, you can solve this \
using MooseX::UndefTolerant. However, some of us are stuck using \
non-UndefTolerant classes written by third parties.) \
 \
To ensure that the Person constructor does not try to set a name or age at \
all when they are undefined, ugly looking code like this is often used: \
 \
 my $bob = Person->new( \
    defined $name ? (name => $name) : (), \
    defined $age ? (age => $age) : (), \
 ); \
 \
or: \
 \
 my $bob = Person->new( \
    (name => $name) x!!(defined $name), \
    (age  => $age)  x!!(defined $age), \
 ); \
 \
A slightly more elegant solution is the 'maybe' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.202"

RPM_NAME = "perl-PerlX-Maybe-1.202-1.23.noarch.rpm"
RPM_HASH = "89a7af9102d4d9600ea13ed0a56cdf1eb2504b2c09c7ca441fb4238c2662a767ff8b3ccc99b687414d597d238aff7446ceb20ef10fcf92072f967853e4000895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlX--Maybe \
perl-PerlX-Maybe \
perl-Syntax--Feature--Maybe"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
