SUMMARY = "A simple interface to subversion's editor interface"
DESCRIPTION = "SVN::Simple::Edit wraps the subversion delta editor with a perl \
friendly interface and then you could easily drive it for describing \
changes to a tree. A common usage is to wrap the commit editor, so you \
could make commits to a subversion repository easily. \
 \
 \
 \
Authors: \
-------- \
    Chia-liang Kao <clkao at clkao dot org>"
LICENSE = "Artistic-1.0"

PV = "0.28"

RPM_NAME = "perl-SVN-Simple-0.28-3.44.aarch64.rpm"
RPM_HASH = "4d3ea3abc9b20b2258c63709eb211d6b1f957ad926985fe15d19a3f28ec51d280d6f548694975d157bafa28243b896055625d83f3e7630d67f6ab9a517d98ddc"

RPROVIDES:${PN} += "perl-SVN--Simple--Edit \
perl-SVN--Simple--Editor \
perl-SVN-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
subversion-perl"

inherit rpm
