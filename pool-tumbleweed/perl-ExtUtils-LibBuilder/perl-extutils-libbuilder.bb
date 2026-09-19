SUMMARY = "Tool to build C libraries"
DESCRIPTION = "A tool to build C libraries."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-ExtUtils-LibBuilder-0.90.0-1.10.noarch.rpm"
RPM_HASH = "e140822483c360f5deafb39605c7e8646177a5a326064c7a2ada3a4febec6b768c5066b64bd73546eedf761d4b40de269f8d4749d3959b8a7144a435de4fc030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--LibBuilder \
perl-ExtUtils-LibBuilder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
