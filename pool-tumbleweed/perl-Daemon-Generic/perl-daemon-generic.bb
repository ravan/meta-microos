SUMMARY = "Framework to Provide Start/Stop/Reload for a Daemon"
DESCRIPTION = "Daemon::Generic provides a framework for starting, stopping, reconfiguring \
daemon-like programs. The framework provides for standard commands that \
work for as init.d files and as apachectl-like commands. \
 \
Programs that use Daemon::Generic subclass Daemon::Generic to override its \
behavior. Almost everything that Genric::Daemon does can be overridden as \
needed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.85"

RPM_NAME = "perl-Daemon-Generic-0.85-1.36.noarch.rpm"
RPM_HASH = "bf462ca281b9269c43cbfe08fdefc71384966e9daa48556f992a5f1ddece45999f0f41c4b33bc06e6b7a2852b95bf36adc38f26f5ea36ca5436fde7a73e00ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Daemon--Generic \
perl-Daemon--Generic--AnyEvent \
perl-Daemon--Generic--Event \
perl-Daemon--Generic--While1 \
perl-Daemon-Generic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Flock \
perl-File--Slurp"

inherit rpm
