SUMMARY = "Write command line apps with less suffering"
DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved. \
 \
For information on how to start using App::Cmd, see App::Cmd::Tutorial."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.340.0"

RPM_NAME = "perl-App-Cmd-0.340.0-1.3.noarch.rpm"
RPM_HASH = "f9774b0c1ec7ee50fe9950e87e249271d29e9f5c0c5b2a042d61db868d5ff6b3394a1bdb200f56e3a4d15b37c509f3e2e1aacf57ea096199550e9ed0552e47b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Cmd \
perl-App--Cmd--ArgProcessor \
perl-App--Cmd--Command \
perl-App--Cmd--Command--commands \
perl-App--Cmd--Command--help \
perl-App--Cmd--Command--version \
perl-App--Cmd--Plugin \
perl-App--Cmd--Setup \
perl-App--Cmd--Simple \
perl-App--Cmd--Subdispatch \
perl-App--Cmd--Subdispatch--DashedStyle \
perl-App--Cmd--Tester \
perl-App--Cmd--Tester--CaptureExternal \
perl-App--Cmd--Tester--Exited \
perl-App--Cmd--Tester--Result \
perl-App-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Data--OptList \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-IO--TieCombine \
perl-Module--Pluggable--Object \
perl-Pod--Usage \
perl-String--RewritePrefix \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install \
perl-experimental \
perl-parent"

inherit rpm
