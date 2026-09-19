SUMMARY = "Web Scraping Toolkit using HTML and CSS Selectors or XPath expressions"
DESCRIPTION = "Web::Scraper is a web scraper toolkit, inspired by Ruby's equivalent \
Scrapi. It provides a DSL-ish interface for traversing HTML documents and \
returning a neatly arranged Perl data structure. \
 \
The _scraper_ and _process_ blocks provide a method to define what segments \
of a document to extract. It understands HTML and CSS Selectors as well as \
XPath expressions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.38"

RPM_NAME = "perl-Web-Scraper-0.38-1.25.noarch.rpm"
RPM_HASH = "4fc49bc8d0bc03653bcd4df5401b47c42d8196d0e89990be9dd3035f34841f6e27d08f2e022033afa47c42e921552de21036dbfedcbdbfd7d3844a9a3b9013d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--Scraper \
perl-Web--Scraper--Filter \
perl-Web--Scraper--LibXML \
perl-Web-Scraper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities \
perl-HTML--Selector--XPath \
perl-HTML--Tagset \
perl-HTML--TreeBuilder \
perl-HTML--TreeBuilder--XPath \
perl-LWP \
perl-UNIVERSAL--require \
perl-URI \
perl-XML--XPathEngine \
perl-YAML"

inherit rpm
