SUMMARY = "WebSocket server as a PSGI application"
DESCRIPTION = "This module is a PSGI application that creates an endpoint for WebSocket \
connections."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Plack-App-WebSocket-0.08-1.27.noarch.rpm"
RPM_HASH = "c9cac5e0a434ad4d977f8f17f33697ae451dfcf6faf6ba365976fc34fc468d3896370ced551fa90bdca912e40b8961afc6c597083a319e95eac52ca6a75858af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--App--WebSocket \
perl-Plack--App--WebSocket--Connection \
perl-Plack-App-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent \
perl-AnyEvent--WebSocket--Server \
perl-Devel--GlobalDestruction \
perl-Plack--Component \
perl-Plack--Response \
perl-Try--Tiny \
perl-parent"

inherit rpm
