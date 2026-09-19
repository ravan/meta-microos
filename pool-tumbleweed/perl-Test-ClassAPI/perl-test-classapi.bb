SUMMARY = "Provides basic first-pass API testing for large class trees"
DESCRIPTION = "For many APIs with large numbers of classes, it can be very useful to be \
able to do a quick once-over to make sure that classes, methods, and \
inheritance is correct, before doing more comprehensive testing. This \
module aims to provide such a capability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Test-ClassAPI-1.07-1.35.noarch.rpm"
RPM_HASH = "2d81dbfa6e6633ec9b8c8eed56bfe1db2c57c201db746a29e8ead2744cdd3874cb4452586c39b295214cea89226df5e8d5af5473b3890b0dcf8265f7f5cd6a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--ClassAPI \
perl-Test-ClassAPI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Inspector \
perl-Config--Tiny \
perl-Params--Util"

inherit rpm
