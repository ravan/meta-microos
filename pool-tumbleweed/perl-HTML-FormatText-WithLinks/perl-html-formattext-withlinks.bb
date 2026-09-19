SUMMARY = "HTML to text conversion with links as footnotes"
DESCRIPTION = "HTML::FormatText::WithLinks takes HTML and turns it into plain text but \
prints all the links in the HTML as footnotes. By default, it attempts to \
mimic the format of the lynx text based web browser's --dump option."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-HTML-FormatText-WithLinks-0.15-1.35.noarch.rpm"
RPM_HASH = "94d879d09b813e10641ab88e2ab1bb3680c3ed75003ac58744030035986f04f956ded656f927123a05db7de196d6f18e7ddd9f1a9c20d4f94899bc8c9e9dad2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatText--WithLinks \
perl-HTML-FormatText-WithLinks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--FormatText \
perl-HTML--TreeBuilder \
perl-URI--WithBase"

inherit rpm
