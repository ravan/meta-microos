SUMMARY = "Higher-order list utility functions"
DESCRIPTION = "This module provides a number of list utility functions, all of which take \
an initial code block to control their behaviour. They are variations on \
similar core perl or 'List::Util' functions of similar names, but which use \
the block to control their behaviour. For example, the core Perl function \
'sort' takes a list of values and returns them, sorted into order by their \
string value. The sort_by function sorts them according to the string value \
returned by the extra function, when given each value. \
 \
   my @names_sorted = sort @names; \
 \
   my @people_sorted = sort_by { $_->name } @people;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-List-UtilsBy-0.12-1.22.noarch.rpm"
RPM_HASH = "b6c6be8aaab1bfedfb8f4c274f9d6b5f53120575197703e9b228e032cea31b14b067ead23e8f17587b03aae3b4ee3d56a15f9da1547c0be49ecdfbff3490c3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--UtilsBy \
perl-List-UtilsBy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
