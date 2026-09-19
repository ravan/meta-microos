SUMMARY = "Mojolicious server status"
DESCRIPTION = "Mojolicious::Plugin::Status is a Mojolicious plugin providing a server \
status ui for Mojo::Server::Daemon and Mojo::Server::Prefork. Note that \
this module is *EXPERIMENTAL* and should therefore only be used for \
debugging purposes."
LICENSE = "Artistic-2.0"

PV = "1.17"

RPM_NAME = "perl-Mojolicious-Plugin-Status-1.17-1.26.noarch.rpm"
RPM_HASH = "495e5617e796075f12eadfd530af60ec1d1f54272794e54c54bac5b9023432799f7e733d357d64269effb86765a83b5bc8b8a3389b75dc6854596b37f4afb805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--MemoryMap \
perl-Mojo--MemoryMap--Writer \
perl-Mojolicious--Plugin--Status \
perl-Mojolicious-Plugin-Status"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-BSD--Resource \
perl-File--Map \
perl-File--Temp \
perl-Mojolicious \
perl-Sereal"

inherit rpm
