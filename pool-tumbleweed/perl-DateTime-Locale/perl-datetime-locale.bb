SUMMARY = "Localization support for DateTime.pm"
DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales. \
 \
If you want to know what methods are available for locale objects, then \
please read the DateTime::Locale::FromData documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.460000"

RPM_NAME = "perl-DateTime-Locale-1.460000-1.1.noarch.rpm"
RPM_HASH = "c1d52e23186b331307d3010f6e75311767a61eac431f959313bcbd553b269234960330a73d662a75de98c8c5cb17f4a467084694a356ce9ddfb97332eac218c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--Catalog \
perl-DateTime--Locale--Data \
perl-DateTime--Locale--FromData \
perl-DateTime--Locale--Util \
perl-DateTime-Locale"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Dist--CheckConflicts \
perl-File--ShareDir \
perl-List--Util \
perl-Params--ValidationCompiler \
perl-Specio--Declare \
perl-Specio--Library--String \
perl-namespace--autoclean"

inherit rpm
