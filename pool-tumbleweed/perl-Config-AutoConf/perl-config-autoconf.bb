SUMMARY = "Module to implement some of AutoConf macros in pure perl"
DESCRIPTION = "Config::AutoConf is intended to provide the same opportunities to Perl \
developers as at http://www.gnu.org/software/autoconf/ does for Shell \
developers. \
 \
As Perl is the second most deployed language (mind: every Unix comes with \
Perl, several mini-computers have Perl and even lot's of Windows machines \
run Perl software - which requires deployed Perl there, too), this gives \
wider support than Shell based probes. \
 \
The API is leaned against GNU Autoconf, but we try to make the API \
(especially optional arguments) more Perl'ish than m4 abilities allow to \
the original."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.320"

RPM_NAME = "perl-Config-AutoConf-0.320-1.25.noarch.rpm"
RPM_HASH = "e9db13f1cbc115af3d4cf921ab9ee83e7b29865dd3410e107fe330aebf8c91681ae65c63e9bfb7ee88681dd9b88e229e95e37d94b57595ddd1f8ff59bd6a7e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--AutoConf \
perl-Config-AutoConf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny"

inherit rpm
