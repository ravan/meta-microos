SUMMARY = "Report a problem, pluggable handlers and language support"
DESCRIPTION = "Get messages to users and logs. 'Log::Report' combines three tasks which \
are closely related in one: \
 \
* 1. logging (like Log::Log4Perl and syslog), and \
 \
* 2. exceptions (like 'error' and 'info'), with \
 \
* 3. translations (like 'gettext' and Locale::TextDomain) \
 \
You *do not need* to use this module for all three reasons: pick what you \
need now, maybe extend the usage later. Read more about how and why in the \
DETAILS section, below. Especially, you should *read about the REASON \
parameter*. \
 \
Also, you can study this module swiftly via the article published in the \
German Perl '$foo-magazine'. English version: \
https://perl.overmeer.net/log-report/papers/201306-PerlMagazine-article-en. \
html"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.460.0"

RPM_NAME = "perl-Log-Report-1.460.0-1.3.noarch.rpm"
RPM_HASH = "ec45b693dc03d96ba4397e90410744e95651df7863f95076be6f1a86a7c930a16ca3bdf82b960ec76488c167b776625b206b39d36e588b17bce812e1dfea5081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Report \
perl-Log--Report--DBIC--Profiler \
perl-Log--Report--Die \
perl-Log--Report--Dispatcher \
perl-Log--Report--Dispatcher--Callback \
perl-Log--Report--Dispatcher--File \
perl-Log--Report--Dispatcher--Log4perl \
perl-Log--Report--Dispatcher--LogDispatch \
perl-Log--Report--Dispatcher--Perl \
perl-Log--Report--Dispatcher--Syslog \
perl-Log--Report--Dispatcher--Try \
perl-Log--Report--Domain \
perl-Log--Report--Exception \
perl-Log--Report--Message \
perl-Log--Report--Translator \
perl-Log-Report \
perl-MojoX--Log--Report"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--GlobalDestruction \
perl-Log--Report--Optional \
perl-String--Print \
perl-Sys--Syslog"

inherit rpm
