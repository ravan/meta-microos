SUMMARY = "PSGI handler for HTTP::Server::Simple"
DESCRIPTION = "HTTP::Server::Simple::PSGI is a HTTP::Server::Simple based HTTP server that \
can run PSGI applications. This module only depends on \
HTTP::Server::Simple, which itself doesn't depend on any non-core modules \
so it's best to be used as an embedded web server."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-HTTP-Server-Simple-PSGI-0.16-1.26.noarch.rpm"
RPM_HASH = "62c2ca6560a247b5d2e011d604a26a1251ae60eece27310a922b9a44a4e494a44826bdbce531c4ee8a26c7b233e56ffe08e6872385a1c63582f4f3d0aad5fcc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Server--Simple--PSGI \
perl-HTTP--Server--Simple--PSGI--Writer \
perl-HTTP-Server-Simple-PSGI \
perl-Plack--Handler--HTTP--Server--Simple \
perl-Plack--Handler--HTTP--Server--Simple--PSGIServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Server--Simple"

inherit rpm
