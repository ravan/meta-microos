SUMMARY = "Cookie string generator / parser"
DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-Cookie-Baker-0.120.0-2.12.noarch.rpm"
RPM_HASH = "2c56e518fabb0132d1ba2825eb0b2ee7a0ffa4f66ededdee3f08e6e1a03eb694f6a19019739ff866f00fdc80a0b6040ec81736da56ff1e36781fe67e8036d4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cookie--Baker \
perl-Cookie-Baker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI--Escape"

inherit rpm
