SUMMARY = "Warns and dies noisily with stack backtraces"
DESCRIPTION = "This module is meant as a debugging aid. It can be used to make a script \
complain loudly with stack backtraces when warn()ing or die()ing. \
 \
Here are how stack backtraces produced by this module looks: \
 \
   \
  $ perl -MCarp::Always -e 'sub f { die 'arghh' }; sub g { f }; g' \
  arghh at -e line 1 \
          main::f() called at -e line 1 \
          main::g() called at -e line 1 \
 \
   \
  $ perl -MCarp::Always -w -e 'sub f { $a = shift; @a = @$a };' \\ \
                           -e 'sub g { f(undef) }; g' \
  Use of uninitialized value in array dereference at -e line 1 \
          main::f('undef') called at -e line 2 \
          main::g() called at -e line 2 \
 \
In the implementation, the Carp module does the heavy work, through \
'longmess()'. The actual implementation sets the signal hooks \
$SIG{__WARN__} and $SIG{__DIE__} to emit the stack backtraces. \
 \
Also, all uses of 'carp' and 'croak' are made verbose, behaving like \
'cluck' and 'confess'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.160.0"

RPM_NAME = "perl-Carp-Always-0.160.0-1.7.noarch.rpm"
RPM_HASH = "1c6aeaf3ab8de6aef7b5cfddb6984a55505480b4077e6d5eb94d4ff7b1edc20977f6274537345b195dec445965c3ba4b6c0cc272620dfee53c663837b5c5a1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Always \
perl-Carp-Always"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
