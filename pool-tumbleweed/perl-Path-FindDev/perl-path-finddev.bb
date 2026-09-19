SUMMARY = "Find a development path somewhere in an upper hierarchy"
DESCRIPTION = "This package is mostly a glue layer around 'Path::IsDev' with a few \
directory walking tricks. \
 \
    use Path::FindDev qw( find_dev ); \
 \
    if ( my $root = find_dev('/some/path/to/something/somewhere')) { \
        print 'development root = $root'; \
    } else { \
        print 'No development root :('; \
    }"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.5.3"

RPM_NAME = "perl-Path-FindDev-0.5.3-1.38.noarch.rpm"
RPM_HASH = "a6de2109f11a6404912a8ba5abc634e7a7dd3c684cfd848ce54b63f4c4ae54353a62ac8b460b102182f230d49953815cc97f9feedf997a11cdf15588acd3873f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--FindDev \
perl-Path--FindDev--Object \
perl-Path-FindDev"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Tiny \
perl-Path--IsDev \
perl-Path--IsDev--Object \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
