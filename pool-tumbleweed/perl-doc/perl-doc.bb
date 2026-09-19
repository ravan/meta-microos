SUMMARY = "Perl Documentation"
DESCRIPTION = "Perl man pages and pod files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.44.0"

RPM_NAME = "perl-doc-5.44.0-1.2.noarch.rpm"
RPM_HASH = "459e2c22b19956d3a8f34664ee3f41d53a934969df0d5f6cab939bedc1c989a56428614a830f93cdae6e03b31bf99ed483de6f66999ecfe1304181ebd9002adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-/usr/share/man/man3/CORE.3pm.gz \
perl-doc \
perl-macros"

RDEPENDS:${PN} += "perl"

inherit rpm
