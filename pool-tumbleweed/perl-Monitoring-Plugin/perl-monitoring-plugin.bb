SUMMARY = "Family of Perl modules to streamline writing Nagios compatible plugins"
DESCRIPTION = "Monitoring::Plugin and its associated Monitoring::Plugin::* modules are a \
family of perl modules to streamline writing Monitoring plugins. The main \
end user modules are Monitoring::Plugin, providing an object-oriented \
interface to the entire Monitoring::Plugin::* collection, and \
Monitoring::Plugin::Functions, providing a simpler functional interface to \
a useful subset of the available functionality. \
 \
The purpose of the collection is to make it as simple as possible for \
developers to create plugins that conform the Monitoring Plugin guidelines \
(https://www.monitoring-plugins.org/doc/guidelines.html)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40"

RPM_NAME = "perl-Monitoring-Plugin-0.40-1.31.noarch.rpm"
RPM_HASH = "769a66993f1191983205146d55e4b6c4be9c8fb710aad79c619f39a5e7ccd74126057736842ba270d9e5e4d4ceaafd4ba086fae33e3caea4dc4d54e2545fe61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Monitoring--Plugin \
perl-Monitoring--Plugin--Config \
perl-Monitoring--Plugin--ExitResult \
perl-Monitoring--Plugin--Functions \
perl-Monitoring--Plugin--Getopt \
perl-Monitoring--Plugin--Performance \
perl-Monitoring--Plugin--Range \
perl-Monitoring--Plugin--Threshold \
perl-Monitoring-Plugin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate \
perl-base"

inherit rpm
