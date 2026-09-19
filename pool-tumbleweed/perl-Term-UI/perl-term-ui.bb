SUMMARY = "Term::ReadLine UI made easy"
DESCRIPTION = "'Term::UI' is a transparent way of eliminating the overhead of having to \
format a question and then validate the reply, informing the user if the \
answer was not proper and re-issuing the question. \
 \
Simply give it the question you want to ask, optionally with choices the \
user can pick from and a default and 'Term::UI' will DWYM. \
 \
For asking a yes or no question, there's even a shortcut."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.50"

RPM_NAME = "perl-Term-UI-0.50-1.25.noarch.rpm"
RPM_HASH = "be71984dc02c3b3b161e5922c5ea01446a39c87c48ac4ed624e74b95bf2c8fd3f1ed9264e921f56340af0b53f3526809be18ed117cd978e627bb43cfe65b97ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--UI \
perl-Term--UI--History \
perl-Term-UI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Locale--Maketext--Simple \
perl-Log--Message--Simple \
perl-Params--Check \
perl-parent"

inherit rpm
