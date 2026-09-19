SUMMARY = "Easily timeout long running operations"
DESCRIPTION = "The 'Time::Out' module provides an easy interface to alarm(2) based \
timeouts. Nested timeouts are supported. The module exports the 'timeout()' \
function by default. The function returns whatever the code placed inside \
the subroutine reference returns: \
 \
  use Time::Out qw( timeout ); \
 \
  my $result = timeout 5 => sub { \
    return 7; \
  }; \
   \
 \
If 'Time::Out' sees that Time::HiRes has been loaded, it will use that \
'alarm()' function (if available) instead of the default one, allowing \
float timeout values to be used effectively: \
 \
  use Time::HiRes qw(); \
  use Time::Out   qw( timeout ); \
 \
  timeout 3.1416 => sub { \
     \
  };"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.0"

RPM_NAME = "perl-Time-Out-1.0.0-1.10.noarch.rpm"
RPM_HASH = "78ada1fd0c1b1959ec04a0a405a5ae1a08b39a8bf074edde881c88e759f71e82b6fd111a4beda5da84119d9f2aa48c905f742c40195bba46ddd861f2413afc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Out \
perl-Time--Out--Exception \
perl-Time--Out--ParamConstraints \
perl-Time-Out"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Try--Tiny \
perl-version"

inherit rpm
