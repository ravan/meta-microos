SUMMARY = "tests strings for equality, with more helpful failures"
DESCRIPTION = "This module provides some drop-in replacements for the string comparison \
functions of the Test::More manpage, but which are more suitable when you \
test against long strings. If you've ever had to search for text in a \
multi-line string like an HTML document, or find specific items in binary \
data, this is the module for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-LongString-0.17-1.42.noarch.rpm"
RPM_HASH = "4157d0351d58a8e42e1118ce933badb23110d66758e70dd675e6ad3cf14b56e5c33e34504b52cae97fc790567b805432121105775c8ca9aa5f8ff80d944d0388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LongString \
perl-Test-LongString"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder--Tester"

inherit rpm
