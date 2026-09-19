SUMMARY = "Joins the gettext and Maketext frameworks"
DESCRIPTION = "Locale::Maketext::Gettext joins the GNU gettext and Maketext frameworks. It \
is a subclass of Locale::Maketext(3) that follows the way GNU gettext \
works. It works seamlessly, _both in the sense of GNU gettext and \
Maketext_. As a result, you _enjoy both their advantages, and get rid of \
both their problems, too._ \
 \
You start as a usual GNU gettext localization project: Work on PO files \
with the help of translators, reviewers and Emacs. Turn them into MO files \
with _msgfmt_. Copy them into the appropriate locale directory, such as \
_/usr/share/locale/de/LC_MESSAGES/myapp.mo_. \
 \
Then, build your Maketext localization class, with your base class changed \
from Locale::Maketext(3) to Locale::Maketext::Gettext. That is all."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.32"

RPM_NAME = "perl-Locale-Maketext-Gettext-1.32-1.26.noarch.rpm"
RPM_HASH = "a733444af1114f93e9e56dc2da451a21f20d82ed95019ce64dea1fd8f6f75a5b6b055004534a0e1e51e3cb9585dc227052494320bd7ce2bab35210dea8dd762a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Maketext--Gettext \
perl-Locale--Maketext--Gettext--Functions \
perl-Locale--Maketext--Gettext--Functions---EMPTY \
perl-Locale--Maketext--Gettext--Functions---EMPTY--i-default \
perl-Locale-Maketext-Gettext"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
