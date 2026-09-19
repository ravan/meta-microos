SUMMARY = "Apparently run a function in a higher stack frame"
DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is \
just to fool caller(). All the really naughty bits of Tcl's uplevel() \
are avoided."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.2800"

RPM_NAME = "perl-Sub-Uplevel-0.2800-1.32.noarch.rpm"
RPM_HASH = "3a53846175bd1066b683c1f9dcddc23aca457b0a86f1d431bc33414262b0a33e59e916d3ec35dccd7b69135fb49143f5dc1fca92ec2a5176faf19c57fb13984d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Sub--Uplevel \
perl-Sub-Uplevel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
