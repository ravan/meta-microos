SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.7"

RPM_NAME = "FastCGI-devel-2.4.7-1.7.aarch64.rpm"
RPM_HASH = "e97eed68ff1a402af14495e27b5745cfea8375059b037e0d6faffff9de2631c879a48c34884b89bab0a050da2fb13f91ec8c161199999d96f7d9dd6dc16fa5bc"

RPROVIDES:${PN} += "FastCGI-devel \
pkgconfig-fcgi \
pkgconfig-fcgi++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfcgi0"

inherit rpm
