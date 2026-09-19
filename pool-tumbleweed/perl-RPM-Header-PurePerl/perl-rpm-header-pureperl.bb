SUMMARY = "A Perl only implementation of a RPM header reader"
DESCRIPTION = "RPM::Header::PurePerl is a clone of RPM::Header written in only Perl, so it \
provides a way to read an rpm package on systems where rpm is not installed. \
RPM::Header::PurePerl can be used as a drop in replacement for RPM::Header, \
if needed also the other way round."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.0.2"

RPM_NAME = "perl-RPM-Header-PurePerl-1.0.2-1.41.aarch64.rpm"
RPM_HASH = "a388bce218c4638526655d445c7e73957f5d8f07f503b21051ae54eeb461288d75566e2c3578b8ad9387db6c098e37ab3d23dd9f8de75f4ffc8cc825f6811fd2"

RPROVIDES:${PN} += "perl-RPM--Header--PurePerl \
perl-RPM--Header--PurePerl--Tagtable \
perl-RPM-Header-PurePerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
