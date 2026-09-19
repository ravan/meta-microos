SUMMARY = "Tcp_connect with transparent proxy handling"
DESCRIPTION = "AnyEvent::Connector object has 'tcp_connect' method compatible with that \
from AnyEvent::Socket, and it handles proxy settings transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40.0"

RPM_NAME = "perl-AnyEvent-Connector-0.40.0-2.12.noarch.rpm"
RPM_HASH = "d418deb2a5379ca633ea5fa12c667766aab44718feae2ada1675bf0bafdee217adae2bdd0493342b198ff251357dad4acfac00ad901005cedc79263f7ad07f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--Connector \
perl-AnyEvent--Connector--Proxy--http \
perl-AnyEvent-Connector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-URI"

inherit rpm
