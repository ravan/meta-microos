SUMMARY = "Perl extension to trace subroutine calls"
DESCRIPTION = "Debug::Trace instruments subroutines to provide tracing information upon \
every call and return. \
 \
Using Debug::Trace does not require any changes to your sources. Most \
often, it will be used from the command line: \
 \
  perl -MDebug::Trace=foo,bar yourprogram.pl \
 \
This will have your subroutines foo() and bar() printing call and return \
information. \
 \
Subroutine names may be fully qualified to denote subroutines in other \
packages than the default main::. \
 \
By default, the trace information is output using the standard warn() \
function."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-Debug-Trace-0.05-3.42.noarch.rpm"
RPM_HASH = "5dd155e0a545e1f9e101d6c8f6c6b376c50d685910e77b172dc0f3ea9bf2221e8a9ae031a19eba09479ac3fc907be6245104714b11246a19c1b89ff428cead90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Debug--Trace \
perl-Debug-Trace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
