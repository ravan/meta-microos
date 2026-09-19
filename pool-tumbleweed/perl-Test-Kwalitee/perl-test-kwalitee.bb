SUMMARY = "Test the Kwalitee of a distribution before you release it"
DESCRIPTION = "Kwalitee is an automatically-measurable gauge of how good your software is. \
That's very different from quality, which a computer really can't measure \
in a general sense. (If you can, you've solved a hard problem in computer \
science.) \
 \
In the world of the CPAN, the CPANTS project (CPAN Testing Service; also a \
funny acronym on its own) measures Kwalitee with several metrics. If you \
plan to release a distribution to the CPAN -- or even within your own \
organization -- testing its Kwalitee before creating a release can help you \
improve your quality as well. \
 \
'Test::Kwalitee' and a short test file will do this for you automatically."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.280.0"

RPM_NAME = "perl-Test-Kwalitee-1.280.0-1.3.noarch.rpm"
RPM_HASH = "bd08a14bc0ebb1abe3915118e0b7a7fbc5f1c5c4ad11a90a805b8fb08931e4df7274e5ac3e33d64f945fd20da0517312df8f6b898efaedbbed8e3703f9dd8ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kwalitee \
perl-Test-Kwalitee"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--CPANTS--Analyse \
perl-Test--Builder \
perl-parent"

inherit rpm
