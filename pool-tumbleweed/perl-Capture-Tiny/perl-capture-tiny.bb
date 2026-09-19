SUMMARY = "Capture STDOUT and STDERR from Perl, XS or external programs"
DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost anything \
sent to STDOUT or STDERR, regardless of whether it comes from Perl, from XS \
code or from an external program. Optionally, output can be teed so that it \
is captured while being passed through to the original filehandles. Yes, it \
even works on Windows (usually). Stop guessing which of a dozen capturing \
modules to use in any particular situation and just use this one."
LICENSE = "Apache-2.0"

PV = "0.500.0"

RPM_NAME = "perl-Capture-Tiny-0.500.0-1.10.noarch.rpm"
RPM_HASH = "3e069d3cb316524cef2cf304c05e6c5d5530aac787830f554bac7f7f00f6f3caa3e5181e53078bb1390d3f5d5a1cafff31ce5663f313f9781d67d502fd99da1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Capture--Tiny \
perl-Capture-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
