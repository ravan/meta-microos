SUMMARY = "CSS Selector to XPath compiler"
DESCRIPTION = "HTML::Selector::XPath is a utility function to compile full set of CSS2 and \
partial CSS3 selectors to the equivalent XPath expression."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.280.0"

RPM_NAME = "perl-HTML-Selector-XPath-0.280.0-2.12.noarch.rpm"
RPM_HASH = "977f2e7e675c6d83dc5a3693a3fe15fdec7a32c7c1cf76987a8dbe5cb10602ad9acf250376ecbe3b82f2f19247c888df341c8bada1986f56c249ec28ed447e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Selector--XPath \
perl-HTML-Selector-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
