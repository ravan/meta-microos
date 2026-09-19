SUMMARY = "Disables bareword filehandles"
DESCRIPTION = "This module lexically disables the use of bareword filehandles with builtin \
functions, except for the special builtin filehandles 'STDIN', 'STDOUT', \
'STDERR', 'ARGV', 'ARGVOUT' and 'DATA'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-bareword-filehandles-0.007-1.38.aarch64.rpm"
RPM_HASH = "866ca7368335c75d4c51b93496dab196e6f92a88bccd5ace845ca7485c5481a186a68c890960faffee781782889845389bcd693813e95014b926591722fa64df"

RPROVIDES:${PN} += "perl-bareword--filehandles \
perl-bareword-filehandles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Hooks--OP--Check"

inherit rpm
