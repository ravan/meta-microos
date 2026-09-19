SUMMARY = "Check for the presence of a compiler"
DESCRIPTION = "This module tries to check if the current system is capable of compiling, \
linking and loading an XS module. \
 \
*Notice*: this is an early release, interface stability isn't guaranteed \
yet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25.0"

RPM_NAME = "perl-ExtUtils-HasCompiler-0.25.0-1.11.noarch.rpm"
RPM_HASH = "75c67a304d8733451a52cf931f4cea866a41d5c3848fabfefb571c0fba90de93f32034d56bf863ff9f65af358230beeabe05a24e9ddefdc340c19a139c642388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--HasCompiler \
perl-ExtUtils-HasCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
