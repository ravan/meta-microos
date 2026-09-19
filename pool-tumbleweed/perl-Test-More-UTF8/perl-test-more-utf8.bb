SUMMARY = "Enhancing Test::More for UTF8-based projects"
DESCRIPTION = "Enhancing Test::More for UTF8-based projects"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Test-More-UTF8-0.05-1.33.noarch.rpm"
RPM_HASH = "35ab9a348ab2257ca85b030936cc4f0875f1153eb7739fe797ecee9332d07ad8e532b01705b05041973a7896585a09ed4d6dfcf1cf69614136dd292503d24885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--More--UTF8 \
perl-Test-More-UTF8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
