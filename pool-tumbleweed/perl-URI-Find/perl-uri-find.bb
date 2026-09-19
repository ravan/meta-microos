SUMMARY = "Find URIs in arbitrary text"
DESCRIPTION = "This module does one thing: Finds URIs and URLs in plain text. It finds \
them quickly and it finds them *all* (or what URI.pm considers a URI to \
be.) It only finds URIs which include a scheme (http:// or the like), for \
something a bit less strict have a look at URI::Find::Schemeless. \
 \
For a command-line interface, urifind is provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20160806"

RPM_NAME = "perl-URI-Find-20160806-1.38.noarch.rpm"
RPM_HASH = "f4db3fbbba06591a92333da68482f694b083e2b80b546df25e0e31e9dcc688028ec35399d5f8b6fc934207f8626aa4e9136bb27df218698fe7e74a5c055a1b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Find \
perl-URI--Find--Schemeless \
perl-URI-Find"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-URI"

inherit rpm
