SUMMARY = "Find the differences between two arrays"
DESCRIPTION = "This module compares two *pre-sorted* arrays and returns the added or \
deleted elements in two separate arrays. It's a simple wrapper around \
Algorithm::Diff. \
 \
*Note*: the arrays must be sorted before you call 'diff'. \
 \
And if you need more complex array tools, check Array::Compare."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-Array-Diff-0.90.0-1.7.noarch.rpm"
RPM_HASH = "bf0af1ecf08b7217efd396e60ace6a074bfe2f6bf27449e9ce3a3613d4e4c1f2a730c5a1f6892762ce6362f7b5a9f15443b7eadce005f449900756db062d9e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Diff \
perl-Array-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Algorithm--Diff \
perl-Class--Accessor--Fast"

inherit rpm
