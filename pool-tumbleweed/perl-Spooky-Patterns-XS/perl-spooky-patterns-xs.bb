SUMMARY = "Spooky::Patterns::XS Perl module"
DESCRIPTION = "Spooky::Patterns::XS Perl module"
LICENSE = "GPL-2.0-or-later"

PV = "1.55"

RPM_NAME = "perl-Spooky-Patterns-XS-1.55-3.26.aarch64.rpm"
RPM_HASH = "5bfee8b08e0e05967d1b02fd17a43f51b48305be4eca5a4ea3cc40f5fbf193ffeef56e52322e96cfcfcc2ef4c7a9d7de667c251e407fcd2e82312f48831f009a"

RPROVIDES:${PN} += "perl-Spooky--Patterns--XS \
perl-Spooky--Patterns--XS--Hash \
perl-Spooky-Patterns-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
