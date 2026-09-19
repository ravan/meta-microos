SUMMARY = "Binary Search within a sorted array."
DESCRIPTION = "A binary search searches *sorted* lists using a divide and conquer \
technique. On each iteration the search domain is cut in half, until the \
result is found. The computational complexity of a binary search is \
O(log n). \
 \
The binary search algorithm implemented in this module is known as a \
_Deferred Detection_ variant on the traditional Binary Search. Deferred \
Detection provides *stable searches*. Stable binary search algorithms have \
the following characteristics, contrasted with their unstable binary search \
cousins: \
 \
* In the case of non-unique keys, a stable binary search will always \
  return the lowest-indexed matching element.  An unstable binary search \
  would return the first one found, which may not be the chronological first. \
 \
* Best and worst case time complexity is always O(log n).  Unstable \
  searches may stop once the target is found, but in the worst case are \
  still O(log n).  In practical terms, this difference is usually not \
  meaningful. \
 \
* Stable binary searches only require one relational comparison of a \
  given pair of data elements per iteration, where unstable binary searches \
  require two comparisons per iteration. \
 \
* The net result is that although an unstable binary search might have \
  better 'best case' performance, the fact that a stable binary search gets \
  away with fewer comparisons per iteration gives it better performance in the \
  worst case, and approximately equal performance in the average case. By \
  trading away slightly better 'best case' performance, the stable search gains \
  the guarantee that the element found will always be the lowest-indexed \
  element in a range of non-unique keys. \
 \
This module has a companion 'XS' module: the List::BinarySearch::XS \
manpage which users are strongly encouraged to install as well. If \
List::BinarySearch::XS is also installed, 'binsearch' and 'binsearch_pos' \
will use XS code. This behavior may be overridden by setting \
'$ENV{List_BinarySearch_PP}' to a true value. Most CPAN installers will \
either automatically install the XS module, or prompt to automatically \
install it. See CONFIGURATION for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-List-BinarySearch-0.25-1.29.noarch.rpm"
RPM_HASH = "e07aeb6fa9181b56559a2a2f9629fb66a859b6d4da3e998fb6a800d9c68cf6619233054638b9df3a1a04f7ac4db5f225ce594e09a5b6b255f3d26f3d0d9a6fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--BinarySearch \
perl-List--BinarySearch--PP \
perl-List-BinarySearch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--BinarySearch--XS"

inherit rpm
