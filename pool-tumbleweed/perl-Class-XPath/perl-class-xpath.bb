SUMMARY = "Adds xpath matching to object trees"
DESCRIPTION = "This module adds XPath-style matching to your object trees. This means that \
you can find nodes using an XPath-esque query with 'match()' from anywhere \
in the tree. Also, the 'xpath()' method returns a unique path to a given \
node which can be used as an identifier. \
 \
To use this module you must already have an OO implementation of a tree. \
The tree must be a true tree - all nodes have a single parent and the tree \
must have a single root node. Also, the order of children within a node \
must be stable. \
 \
*NOTE:* This module is not yet a complete XPath implementation. Over time I \
expect the subset of XPath supported to grow. See the SYNTAX documentation \
for details on the current level of support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.400.0"

RPM_NAME = "perl-Class-XPath-1.400.0-1.9.noarch.rpm"
RPM_HASH = "98907284ee7f50da891387fc0c9c812b7bf00d190ccd4cc277b98e78fad785d42cf6648efabbef21c6a8eaa9b1b7889d552cf0e9c39f5844f44e5fb2d2d22393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--XPath \
perl-Class-XPath \
perl-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
