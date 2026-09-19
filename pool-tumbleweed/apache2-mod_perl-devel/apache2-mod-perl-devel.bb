SUMMARY = "Embedded Perl for Apache - Development package"
DESCRIPTION = "The Apache/Perl integration project brings together the full power of \
the Perl programming language and the Apache HTTP server. \
 \
This package contains the include files useful for developing new \
software depending on apache2-mod_perl."
LICENSE = "Apache-2.0"

PV = "2.0.13"

RPM_NAME = "apache2-mod_perl-devel-2.0.13-4.9.aarch64.rpm"
RPM_HASH = "af2b046ed5bd6a9957926b1070170bac477d4a5e0768f553b4e2f0f78e9d3f3f46684e03a37e6bb2f5a65cc0469eb76d23d45c0c4689773e43f39e4918cd4ac0"

RPROVIDES:${PN} += "apache2-mod-perl-devel"

RDEPENDS:${PN} += "apache2-mod-perl"

inherit rpm
