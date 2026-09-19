SUMMARY = "Add XPath support to HTML::TreeBuilder"
DESCRIPTION = "This module adds typical XPath methods to HTML::TreeBuilder, to make it \
easy to query a document."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-HTML-TreeBuilder-XPath-0.14-1.25.noarch.rpm"
RPM_HASH = "87cf7bad9c1e4b13f5ea99bb9cf124848580e86fbc132562191878956b7930f85b903a280e44bdc18be20b86820f29fbf8128a22a97c7bc9939605c403eef2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--TreeBuilder--XPath \
perl-HTML--TreeBuilder--XPath--Attribute \
perl-HTML--TreeBuilder--XPath--Node \
perl-HTML--TreeBuilder--XPath--Root \
perl-HTML--TreeBuilder--XPath--TextNode \
perl-HTML-TreeBuilder-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--TreeBuilder \
perl-XML--XPathEngine"

inherit rpm
