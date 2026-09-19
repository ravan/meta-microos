SUMMARY = "Handle Common Gateway Interface requests and responses"
DESCRIPTION = "CGI.pm is a stable, complete and mature solution for processing and \
preparing HTTP requests and responses. Major features including processing \
form submissions, file uploads, reading and writing cookies, query string \
generation and manipulation, and processing and preparing HTTP headers. \
 \
CGI.pm performs very well in a vanilla CGI.pm environment and also comes \
with built-in support for mod_perl and mod_perl2 as well as FastCGI. \
 \
It has the benefit of having developed and refined over 20 years with input \
from dozens of contributors and being deployed on thousands of websites. \
CGI.pm was included in the perl distribution from perl v5.4 to v5.20, \
however is has now been removed from the perl core..."
LICENSE = "Artistic-2.0"

PV = "4.720.0"

RPM_NAME = "perl-CGI-4.720.0-1.3.noarch.rpm"
RPM_HASH = "15b1c23c2fbf2d2bdde6c2b8dcc9aa306666c1d3050a36933308ab8dcf07f5f79eca3933c5883773e2f79299376de0d973d6f59859c576a8583be90f6bfe4351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI \
perl-CGI--Carp \
perl-CGI--Cookie \
perl-CGI--File--Temp \
perl-CGI--HTML--Functions \
perl-CGI--MultipartBuffer \
perl-CGI--Pretty \
perl-CGI--Push \
perl-CGI--Util \
perl-Fh"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Temp \
perl-HTML--Entities \
perl-URI \
perl-parent"

inherit rpm
