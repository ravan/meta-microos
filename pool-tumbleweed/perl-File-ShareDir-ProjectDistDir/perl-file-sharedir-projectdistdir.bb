SUMMARY = "Simple set-and-forget using of a '/share' directory in your projects root"
DESCRIPTION = "Simple set-and-forget using of a '/share' directory in your projects root"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.000009"

RPM_NAME = "perl-File-ShareDir-ProjectDistDir-1.000009-1.39.noarch.rpm"
RPM_HASH = "0fa169e92622d711b445929773240b22c9533592491caef82687e372285d97ec9e45ee52651897f8a937e3847ff8f2ce4bf3a90028837fd0dbf821ed556b4847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--ProjectDistDir \
perl-File-ShareDir-ProjectDistDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir \
perl-Path--FindDev \
perl-Path--IsDev \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
