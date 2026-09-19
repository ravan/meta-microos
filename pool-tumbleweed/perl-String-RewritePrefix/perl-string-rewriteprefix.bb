SUMMARY = "Rewrite strings based on a set of known prefixes"
DESCRIPTION = "rewrite strings based on a set of known prefixes"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-RewritePrefix-0.009-1.18.noarch.rpm"
RPM_HASH = "09b8a9e966816edcadd39e219bf8082169a2b13cee6b2632f65a559856c07a792b5880dd5bab9f48c8ed8ff20321b91efef3755a6e8e0902f04f81a90b7eded2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--RewritePrefix \
perl-String-RewritePrefix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter"

inherit rpm
