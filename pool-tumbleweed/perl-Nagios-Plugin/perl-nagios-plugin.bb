SUMMARY = "A family of perl modules to streamline writing Nagios plugins"
DESCRIPTION = "Nagios::Plugin and its associated Nagios::Plugin::* modules are a family of \
perl modules to streamline writing Nagios plugins. The main end user modules \
are Nagios::Plugin, providing an object-oriented interface to the entire \
Nagios::Plugin::* collection, and Nagios::Plugin::Functions, providing a \
simpler functional interface to a useful subset of the available functionality. \
 \
The purpose of the collection is to make it as simple as possible for \
developers to create plugins that conform the Nagios Plugin guidelines \
(http://nagiosplug.sourceforge.net/developer-guidelines.html)."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.36"

RPM_NAME = "perl-Nagios-Plugin-0.36-11.12.aarch64.rpm"
RPM_HASH = "ede9e755e56f475934fe0f4a435dbe7a3e380cd2a0e8483a1622cfd0c7548146c82e781886790e8fde999863bfcd21c439c899000224c4e80818f87524bad56f"

RPROVIDES:${PN} += "Nagios-Plugin \
perl-Nagios--Plugin \
perl-Nagios--Plugin--Config \
perl-Nagios--Plugin--ExitResult \
perl-Nagios--Plugin--Functions \
perl-Nagios--Plugin--Getopt \
perl-Nagios--Plugin--Performance \
perl-Nagios--Plugin--Range \
perl-Nagios--Plugin--Threshold \
perl-Nagios-Plugin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate"

inherit rpm
