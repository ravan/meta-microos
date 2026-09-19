SUMMARY = "Data tables useful in parsing HTML"
DESCRIPTION = "This module contains several data tables useful in various kinds of HTML \
parsing operations. \
 \
Note that all tag names used are lowercase. \
 \
In the following documentation, a 'hashset' is a hash being used as a set \
-- the hash conveys that its keys are there, and the actual values \
associated with the keys are not significant. (But what values are there, \
are always true.)"
LICENSE = "Artistic-2.0"

PV = "3.240.0"

RPM_NAME = "perl-HTML-Tagset-3.240.0-1.12.noarch.rpm"
RPM_HASH = "083b098bfbb6212eb59bd128899e658d564226458c1a5b61dfa46cd210ad35d52c5725bc07eb9fa06deca5267cdff0707849b6a2c229fa054e367378db95395f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Tagset \
perl-HTML-Tagset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
