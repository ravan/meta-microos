SUMMARY = "Include stack traces on all warnings and errors"
DESCRIPTION = "This module is meant as a debugging aid. It can be used to make a script \
complain loudly with stack backtraces when 'warn()'ing or 'die()'ing. \
Unlike other similar modules (e.g. Carp::Always), stack traces will also be \
included when exception objects are thrown. \
 \
The stack traces are generated using Carp, and will work for all types of \
errors. Carp's 'carp' and 'croak' functions will also be made to include \
stack traces. \
 \
   \
  $ perl -d:Confess -e 'sub f { die 'arghh' }; sub g { f }; g' \
  arghh at -e line 1. \
          main::f() called at -e line 1 \
          main::g() called at -e line 1 \
 \
   \
  $ perl -d:Confess -w -e 'sub f { $a = shift; @a = @$a };' \\ \
                                        -e 'sub g { f(undef) }; g' \
  Use of uninitialized value $a in array dereference at -e line 1. \
          main::f(undef) called at -e line 2 \
          main::g() called at -e line 2 \
 \
Internally, this is implemented with $SIG{__WARN__} and $SIG{__DIE__} \
hooks. \
 \
Stack traces are also included if raw non-object references are thrown. \
 \
This module is compatible with all perl versions back to 5.6.2, without \
additional prerequisites. It contains workarounds for a number of bugs in \
the perl interpreter, some of which effect comparatively simpler modules, \
like Carp::Always."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009004"

RPM_NAME = "perl-Devel-Confess-0.009004-1.39.noarch.rpm"
RPM_HASH = "bb2ce6c718ba02f2074ec75631cf687b4a1781fc611898768f943c09e9c21740b2caf67f1bc5f370b36d3fb5e7db5be9d081053546550e6ec21b9c85d636b9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Confess \
perl-Devel--Confess---Util \
perl-Devel--Confess--Builtin \
perl-Devel--Confess--Source \
perl-Devel-Confess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
