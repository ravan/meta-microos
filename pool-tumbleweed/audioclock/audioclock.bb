SUMMARY = "An audible clock"
DESCRIPTION = "This tool emulates the audio of a mechanical clock. \
It shall help to notice the passing of time."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.4"

RPM_NAME = "audioclock-1.3.4-1.1.noarch.rpm"
RPM_HASH = "526eb9f3b05adef0341afe569f024832f2f5744d68f682547c30b9b8dde8c0e31a49801971fd8c3b745cb69df4e383efee97fa227a8178b4643305d8e7fc51e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audioclock"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Alien--SDL \
perl-SDL--Mixer"

inherit rpm
