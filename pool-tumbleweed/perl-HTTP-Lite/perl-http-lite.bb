SUMMARY = "Lightweight HTTP implementation"
DESCRIPTION = "*Note:* you should look at the HTTP::Tiny manpage or the LWP manpage before \
using this module. \
 \
HTTP::Lite is a stand-alone lightweight HTTP/1.1 implementation for perl. \
It is not intended as a replacement for the fully-featured LWP module. \
Instead, it is intended for use in situations where it is desirable to \
install the minimal number of modules to achieve HTTP support, or where LWP \
is not a good candidate due to CPU overhead, such as slower processors. \
HTTP::Lite is also significantly faster than LWP. \
 \
HTTP::Lite is ideal for CGI (or mod_perl) programs or for bundling for \
redistribution with larger packages where only HTTP GET and POST \
functionality are necessary. \
 \
HTTP::Lite supports basic POST and GET operations only. As of 0.2.1, \
HTTP::Lite supports HTTP/1.1 and is compliant with the Host header, \
necessary for name based virtual hosting. Additionally, HTTP::Lite now \
supports Proxies. \
 \
As of 2.0.0 HTTP::Lite now supports a callback to allow processing of \
request data as it arrives. This is useful for handling very large files \
without consuming memory. \
 \
If you require more functionality, such as FTP or HTTPS, please see \
libwwwperl (LWP). LWP is a significantly better and more comprehensive \
package than HTTP::Lite, and should be used instead of HTTP::Lite whenever \
possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.44"

RPM_NAME = "perl-HTTP-Lite-2.44-1.42.noarch.rpm"
RPM_HASH = "564c0b56102f1d7519f6621313c628a9bf72b2d3e550a209c6032d0badcf3c9d084a858aa36c2ac653e5d23977b8edfff9d0e91b849bea7172638adf9035045c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Lite \
perl-HTTP-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
