SUMMARY = "Framework for building reusable web-applications"
DESCRIPTION = "It is intended that your Application Module will be implemented as a \
sub-class of CGI::Application. This is done simply as follows: \
 \
    package My::App; \
    use base 'CGI::Application'; \
 \
*Notation and Conventions* \
 \
For the purpose of this document, we will refer to the following \
conventions: \
 \
  WebApp.pm   The Perl module which implements your Application Module class. \
  WebApp      Your Application Module class; a sub-class of CGI::Application. \
  webapp.cgi  The Instance Script which implements your Application Module. \
  $webapp     An instance (object) of your Application Module class. \
  $c          Same as $webapp, used in instance methods to pass around the \
              current object. (Sometimes referred as '$self' in other code)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.610.0"

RPM_NAME = "perl-CGI-Application-4.610.0-1.7.noarch.rpm"
RPM_HASH = "22218c575a14465d40bc2d469da8e2b3fcd56af6ef434cd2c83c471df466d58c7144d55f453a717c8306652cc0cb304e159129bcd36661f16e532c65f0748d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Application \
perl-CGI--Application--Mailform \
perl-CGI-Application"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CGI \
perl-Class--ISA \
perl-HTML--Template \
perl-Module--Build \
perl-Test--Requires"

inherit rpm
