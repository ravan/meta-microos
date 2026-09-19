SUMMARY = "Object-oriented CGI interface compliant to CGI.pm"
DESCRIPTION = "CGI::Simple provides a relatively lightweight drop in replacement for \
CGI.pm. It shares an identical OO interface to CGI.pm for parameter \
parsing, file upload, cookie handling and header generation. This module is \
entirely object oriented, however a complete functional interface is \
available by using the CGI::Simple::Standard module. \
 \
Essentially everything in CGI.pm that relates to the CGI (not HTML) side of \
things is available. There are even a few new methods and additions to old \
ones! If you are interested in what has gone on under the hood see the \
Compatibility with CGI.pm section at the end. \
 \
In practical testing this module loads and runs about twice as fast as \
CGI.pm depending on the precise task."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.282.0"

RPM_NAME = "perl-CGI-Simple-1.282.0-1.5.noarch.rpm"
RPM_HASH = "a4757c7f157c8a510b7f02eb8a229ec33a96a62cff9acb6c83296cfe52faaa5cb0b5978d40aa1d3fe109d7757d2a498156415fa4ed2c401cfb3d49c93e43587f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Simple \
perl-CGI--Simple--Cookie \
perl-CGI--Simple--Standard \
perl-CGI--Simple--Util \
perl-CGI-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
