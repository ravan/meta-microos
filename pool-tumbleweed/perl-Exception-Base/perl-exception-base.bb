SUMMARY = "Lightweight exceptions"
DESCRIPTION = "This class implements a fully OO exception mechanism similar to \
Exception::Class or Class::Throwable. It provides a simple interface \
allowing programmers to declare exception classes. These classes can be \
thrown and caught. Each uncaught exception prints full stack trace if the \
default verbosity is increased for debugging purposes. \
 \
The features of 'Exception::Base': \
 \
  * fast implementation of the exception class \
 \
  * fully OO without closures and source code filtering \
 \
  * does not mess with '$SIG{__DIE__}' and '$SIG{__WARN__}' \
 \
  * no external run-time modules dependencies, requires core Perl modules only \
 \
  * the default behavior of exception class can be changed globally or just for \
the thrown exception \
 \
  * matching the exception by class, message or other attributes \
 \
  * matching with string, regex or closure function \
 \
  * creating automatically the derived exception classes (perlfunc/use \
interface) \
 \
  * easily expendable, see Exception::System class for example \
 \
  * prints just an error message or dumps full stack trace \
 \
  * can propagate (rethrow) an exception \
 \
  * can ignore some packages for stack trace output \
 \
  * some defaults (i.e. verbosity) can be different for different exceptions"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.2501"

RPM_NAME = "perl-Exception-Base-0.2501-2.15.noarch.rpm"
RPM_HASH = "bcd6f90db4fc68b1ed2a0e31b71ba8182531e70b3fc172dc34dfe4e29bc6f25be758319b227963fe53a8aabdc16e28e23b0944d5e79bee061556e5882e891845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Base \
perl-Exception-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
