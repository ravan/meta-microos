SUMMARY = "Generate Recursive-Descent Parsers"
DESCRIPTION = "Generate Recursive-Descent Parsers"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.967015"

RPM_NAME = "perl-Parse-RecDescent-1.967015-1.38.aarch64.rpm"
RPM_HASH = "e9d3eb8abaa99a2eecce873b9559774363822fef1708094b79e56f78531e9d6e9175dec09c50730d15944c234ec6cc9c2da298d9555fdd1664e649d5fc04ec1d"

RPROVIDES:${PN} += "perl-Parse--RecDescent \
perl-Parse--RecDescent--Action \
perl-Parse--RecDescent--ColCounter \
perl-Parse--RecDescent--Directive \
perl-Parse--RecDescent--Error \
perl-Parse--RecDescent--Expectation \
perl-Parse--RecDescent--InterpLit \
perl-Parse--RecDescent--LineCounter \
perl-Parse--RecDescent--Literal \
perl-Parse--RecDescent--OffsetCounter \
perl-Parse--RecDescent--Operator \
perl-Parse--RecDescent--Production \
perl-Parse--RecDescent--Repetition \
perl-Parse--RecDescent--Result \
perl-Parse--RecDescent--Rule \
perl-Parse--RecDescent--Subrule \
perl-Parse--RecDescent--Token \
perl-Parse--RecDescent--UncondReject \
perl-Parse-RecDescent"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
