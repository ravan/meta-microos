SUMMARY = "Upload things to the CPAN"
DESCRIPTION = "upload things to the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.103.19"

RPM_NAME = "perl-CPAN-Uploader-0.103.19-1.4.noarch.rpm"
RPM_HASH = "a8a745283b0aed9c8ccd5474472cc114f9cd40363a74059b8029213d391b5b27698750a916ebf9773bf40ed6e59e636f6657700c8d934f4e49c63e2e7accafcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Uploader \
perl-CPAN-Uploader"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long--Descriptive \
perl-HTTP--Request--Common \
perl-HTTP--Status \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Term--ReadKey"

inherit rpm
