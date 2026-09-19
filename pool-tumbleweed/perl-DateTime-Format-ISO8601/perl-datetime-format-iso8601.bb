SUMMARY = "Parses ISO8601 formats"
DESCRIPTION = "Parses almost all ISO8601 date and time formats. ISO8601 time-intervals \
will be supported in a later release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.190.0"

RPM_NAME = "perl-DateTime-Format-ISO8601-0.190.0-1.3.noarch.rpm"
RPM_HASH = "289fee125889fcb2fa6e81df53d8d3d58713c5f8e276874dfaab26af74a2b6bb10de3c2c999a5b95c8b23d1d428a5c610a4c052bd580c2db485d8fea548b0122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--ISO8601 \
perl-DateTime--Format--ISO8601--Types \
perl-DateTime-Format-ISO8601"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-Params--ValidationCompiler \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-namespace--autoclean \
perl-parent"

inherit rpm
