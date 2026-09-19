SUMMARY = "A simple perl Http Server"
DESCRIPTION = "Net::HTTPServer basically turns a CGI script into a stand alone server. \
Useful for temporary services, mobile/local servers, or embedding an HTTP \
server into another program."
LICENSE = "LGPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-Net-HTTPServer-1.1.1-28.12.noarch.rpm"
RPM_HASH = "fc82206fbb85e1d6511e7ffe9ef62c59693b76f4526114821606aaaa12ebf79a057795c1e24f34ff048efeaa0b5b9ff7cb7f9365e5bfbc4641a67f99d940159c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTPServer \
perl-Net--HTTPServer--CaptureSTDOUT \
perl-Net--HTTPServer--Request \
perl-Net--HTTPServer--Response \
perl-Net--HTTPServer--Session \
perl-Net-HTTPServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI"

inherit rpm
