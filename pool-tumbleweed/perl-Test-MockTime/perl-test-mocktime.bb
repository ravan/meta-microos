SUMMARY = "Replaces actual time with simulated time"
DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls to gmtime,time or localtime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-MockTime-0.17-1.33.noarch.rpm"
RPM_HASH = "50f94e4e67de37f605c606af3d7f3be26c0f171ef63926fb7217312633f2577b6c3e1bf0c083855c4cdfcd7964cfdef6f0f8244c946f4ab6bceee3a2c45c8413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime \
perl-Test-MockTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Time--Piece"

inherit rpm
