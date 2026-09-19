SUMMARY = "Object for handling URI templates (RFC 6570)"
DESCRIPTION = "This module provides a wrapper around URI templates as described in RFC \
6570: http://tools.ietf.org/html/rfc6570."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-URI-Template-0.24-1.31.noarch.rpm"
RPM_HASH = "31a375fdf00a84f947aad0490efdb379379e45ee7fabddbb645a5ce915f949f53fb2dfa2f8fb3d20c158eada27402ec68a590a5a1be32aaf814059bb973f2970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Template \
perl-URI-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI \
perl-URI--Escape"

inherit rpm
