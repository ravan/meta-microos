SUMMARY = "Perl extension for nkf (Network Kanji Filter)"
DESCRIPTION = "This is a Perl Extension version of nkf (Network Kanji Filter ) 1.9. \
 \
Usage: \
 \
use NKF; $output = nkf($flag,$input); \
 \
$flag has the same meaning as with nkf."
LICENSE = "BSD-3-Clause"

PV = "2.1.5"

RPM_NAME = "perl-NKF-2.1.5-1.37.aarch64.rpm"
RPM_HASH = "5216c8bcc0872b82de2817f598a119656207f08fb5831fd5eb250e0ec2137401c85d41897931d86b6b54be9d825a07eeaf655d42c49ada8a4c14bdc236374e86"

RPROVIDES:${PN} += "perl-NKF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
