SUMMARY = "Base class for HTML formatters"
DESCRIPTION = "Base class for HTML formatters"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.12"

RPM_NAME = "perl-HTML-Format-2.12-1.33.noarch.rpm"
RPM_HASH = "a012a2c58192eea70b80818a879438703ceae09952bb027d2f7429463071f2440a5836cc35145207a4a6b34aa6ea178a0ddbc3738e4470cfaacc6a3387522d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatMarkdown \
perl-HTML--FormatPS \
perl-HTML--FormatRTF \
perl-HTML--FormatText \
perl-HTML--Formatter \
perl-HTML-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Font--Metrics--Courier \
perl-Font--Metrics--CourierBold \
perl-Font--Metrics--CourierBoldOblique \
perl-Font--Metrics--CourierOblique \
perl-Font--Metrics--Helvetica \
perl-Font--Metrics--HelveticaBold \
perl-Font--Metrics--HelveticaBoldOblique \
perl-Font--Metrics--HelveticaOblique \
perl-Font--Metrics--TimesBold \
perl-Font--Metrics--TimesBoldItalic \
perl-Font--Metrics--TimesItalic \
perl-Font--Metrics--TimesRoman \
perl-HTML--Element \
perl-HTML--TreeBuilder \
perl-parent"

inherit rpm
