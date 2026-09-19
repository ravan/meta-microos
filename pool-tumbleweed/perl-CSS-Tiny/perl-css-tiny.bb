SUMMARY = "Read/Write .css files with as little code as possible"
DESCRIPTION = "'CSS::Tiny' is a perl class to read and write .css stylesheets with as \
little code as possible, reducing load time and memory overhead. CSS.pm \
requires about 2.6 meg or ram to load, which is a large amount of overhead \
if you only want to do trivial things. Memory usage is normally scoffed at \
in Perl, but in my opinion should be at least kept in mind. \
 \
This module is primarily for reading and writing simple files, and anything \
we write shouldn't need to have documentation/comments. If you need \
something with more power, move up to CSS.pm. With the increasing \
complexity of CSS, this is becoming more common, but many situations can \
still live with simple CSS files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.200.0"

RPM_NAME = "perl-CSS-Tiny-1.200.0-1.7.noarch.rpm"
RPM_HASH = "0cc4d9ac0b8b6f09e74eef7331d95acc8ac537c2039663e0737a807cff72d6e1545ea9ae1be1dd7622119d07ccc282a76cbd2b104ba39260e45bfd81a9d917aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CSS--Tiny \
perl-CSS-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
