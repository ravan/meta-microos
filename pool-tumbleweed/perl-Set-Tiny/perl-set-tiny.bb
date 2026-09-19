SUMMARY = "Simple sets of strings"
DESCRIPTION = "Set::Tiny is a thin wrapper around regular Perl hashes to perform often \
needed set operations, such as testing two sets of strings for equality, or \
checking whether one is contained within the other. \
 \
For a more complete implementation of mathematical set theory, see \
Set::Scalar. For sets of arbitrary objects, see Set::Object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60.0"

RPM_NAME = "perl-Set-Tiny-0.60.0-1.10.noarch.rpm"
RPM_HASH = "70a1232a58c16584789ccd426076aa3f7f2c98ef33ce2ed8df4713238c2e280cc11b2e4364865c3f4d4572559101493d6117212cc3a43d98e972a12850193f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--Tiny \
perl-Set-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
