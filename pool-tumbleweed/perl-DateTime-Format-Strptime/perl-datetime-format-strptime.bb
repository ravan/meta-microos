SUMMARY = "Parse and format strp and strf time patterns"
DESCRIPTION = "This module implements most of 'strptime(3)', the POSIX function that is \
the reverse of 'strftime(3)', for 'DateTime'. While 'strftime' takes a \
'DateTime' and a pattern and returns a string, 'strptime' takes a string \
and a pattern and returns the 'DateTime' object associated."
LICENSE = "Artistic-2.0"

PV = "1.800.0"

RPM_NAME = "perl-DateTime-Format-Strptime-1.800.0-1.5.noarch.rpm"
RPM_HASH = "3e8a14ee9cfe3a6dd77d369952708ad4bf5420acf365dc601a7d3354eded9026bd5b8d58222667e59bfdb6fb6f658045b9a66dcb1dddf29073d0b793f6f99912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Strptime \
perl-DateTime--Format--Strptime--Types \
perl-DateTime-Format-Strptime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--FromData \
perl-DateTime--TimeZone \
perl-Params--ValidationCompiler \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--Library--String \
perl-Try--Tiny \
perl-parent"

inherit rpm
