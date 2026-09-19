SUMMARY = "Deterministic time & timers for event loop tests"
DESCRIPTION = "This module replaces actual time with simulated time everywhere (core \
time(), Time::HiRes, EV, AnyEvent with EV, Mojolicious, …) and provide a \
way to write deterministic tests for event loop based applications with \
timers. \
 \
*IMPORTANT!* This module *must* be loaded by your script/app/test before \
other related modules (Time::HiRes, Mojolicious, EV, etc.)."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "perl-Test-Mock-Time-0.2.1-1.12.noarch.rpm"
RPM_HASH = "3952174bc5eddef4ed0c064182eb7965875108ed8c272a87015770bb9c024e15c9663fd703492c7bfddbc6ed37478d47bd5ea7e40914733a621286d9665ff889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Time \
perl-Test-Mock-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Export--Attrs \
perl-List--Util \
perl-Test--MockModule"

inherit rpm
