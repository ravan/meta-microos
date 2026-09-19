SUMMARY = "Work with TLD names"
DESCRIPTION = "  The purpose of this module is to provide user with current list of \
  available top level domain names including new ICANN additions and ccTLDs \
  Currently TLD definitions have been acquired from the following sources: \
 \
  http://www.icann.org/tlds/ \
  http://www.dnso.org/constituency/gtld/gtld.html \
  http://www.iana.org/cctld/cctld-whois.htm \
  https://www.iana.org/domains/root/db"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.750.0"

RPM_NAME = "perl-Net-Domain-TLD-1.750.0-1.3.noarch.rpm"
RPM_HASH = "8773ab7644087bd9c2f0f804d9af1eed6c1341ba7ee58eb31520e1deebea1f8b1ed9bce9f0eca890c22e91507d997dd88470e0af982b4ab6e8e1f1102e7095a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Domain--TLD \
perl-Net-Domain-TLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
