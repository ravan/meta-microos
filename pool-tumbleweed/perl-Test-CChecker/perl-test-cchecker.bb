SUMMARY = "Test-time utilities for checking C headers, libraries, or OS features (D[cut]"
DESCRIPTION = "*DEPRECATED*: The intention of this module was always to test Alien modules \
(both Alien::Base based and non-Alien::Base based modules). It has a number \
of shortcomings that I believe to be better addressed by Test::Alien, so \
please consider using that for new projects, or even migrating existing \
code. \
 \
This module is a very thin convenience wrapper around ExtUtils::CChecker to \
make it useful for use in a test context. It is intended for use with Alien \
modules which need to verify that libraries work as intended with the \
Compiler and flags used by Perl to build XS modules. \
 \
By default this module is very quiet, hiding all output using Capture::Tiny \
unless there is a failure, in which case you will see the commands, flags \
and output used."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Test-CChecker-0.10-1.34.aarch64.rpm"
RPM_HASH = "b21b3aa510ddd9b0888267bf4e1b2ea9445cc798dca9edd25eed72f8bb65894c050c87dd3cab688c140bd80f2b320028cd81fdace18b91111db97eeb7aa46aa8"

RPROVIDES:${PN} += "perl-Test--CChecker \
perl-Test-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-ExtUtils--CChecker"

inherit rpm
