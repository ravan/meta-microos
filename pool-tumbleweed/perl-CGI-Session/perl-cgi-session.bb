SUMMARY = "Persistent session data in CGI applications"
DESCRIPTION = "CGI::Session provides an easy, reliable and modular session management \
system across HTTP requests."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.490.0"

RPM_NAME = "perl-CGI-Session-4.490.0-1.3.noarch.rpm"
RPM_HASH = "3bacb411ad50b60555c73cd9c3221e581eaee47ca7d2cc0f211ab37aff46bae7a15b767a99ac24e22449023f20896fade597e66bc1184a0a0a179805782d357b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Session \
perl-CGI--Session--Driver \
perl-CGI--Session--Driver--DBI \
perl-CGI--Session--Driver--db-file \
perl-CGI--Session--Driver--file \
perl-CGI--Session--Driver--mysql \
perl-CGI--Session--Driver--postgresql \
perl-CGI--Session--Driver--sqlite \
perl-CGI--Session--ErrorHandler \
perl-CGI--Session--ID--incr \
perl-CGI--Session--ID--md5 \
perl-CGI--Session--ID--static \
perl-CGI--Session--Serialize--default \
perl-CGI--Session--Serialize--freezethaw \
perl-CGI--Session--Serialize--storable \
perl-CGI--Session--Test--Default \
perl-CGI--Session--Test--SimpleObjectClass \
perl-CGI--Session--Tutorial \
perl-CGI-Session \
perl-OverloadedClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CGI \
perl-Crypt--SysRandom"

inherit rpm
