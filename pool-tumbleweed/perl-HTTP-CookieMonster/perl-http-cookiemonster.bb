SUMMARY = "Easy read/write access to your jar of HTTP::Cookies"
DESCRIPTION = "This module was created because messing around with HTTP::Cookies is \
non-trivial. HTTP::Cookies a very useful module, but using it is not always \
as easy and clean as it could be. For instance, if you want to find a \
particular cookie, you can't just ask for it by name."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-HTTP-CookieMonster-0.11-1.26.noarch.rpm"
RPM_HASH = "ff111699f8db8d0477a8692927581a035b2eb6e6bc46280c058ac44403d0053e023300342e13b8e4b2972a9b4fcaa1da32862e61f07297128c558944b3567ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieMonster \
perl-HTTP--CookieMonster--Cookie \
perl-HTTP-CookieMonster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Cookies \
perl-Moo \
perl-Safe--Isa \
perl-Sub--Exporter \
perl-URI--Escape"

inherit rpm
