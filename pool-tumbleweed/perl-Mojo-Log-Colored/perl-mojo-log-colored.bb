SUMMARY = "Colored Mojo logging"
DESCRIPTION = "Mojo::Log::Colored is a logger for Mojolicious with colored output for the \
terminal. It lets you define colors for each log level based on \
Term::ANSIColor and comes with sensible default colors. The full lines in \
the log will be colored. \
 \
Since this inherits from Mojo::Log you can still give it a 'file', but the \
output would also be colored. That does not make a lot of sense, so you \
don't want to do that. Use this for development, not production."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-Mojo-Log-Colored-0.04-1.26.noarch.rpm"
RPM_HASH = "3d3a1a248e5d5689b25d7aae5e9fbadcf6bf53af505be7edfedccd7ac45d5d204e73d55bb7299fdac0a7bf586bf72af74ed7a5a4f01f035a358cf57754d67a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Log--Colored \
perl-Mojo-Log-Colored"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious \
perl-Term--ANSIColor"

inherit rpm
