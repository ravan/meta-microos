SUMMARY = "String munging for loggers"
DESCRIPTION = "string munging for loggers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.101246"

RPM_NAME = "perl-String-Flogger-1.101246-1.18.noarch.rpm"
RPM_HASH = "c39d0ea00e3b0dee315e5e8b4aa0cbf590882237ae6a24bdaa92e3c2074394deefd3cacc52d38cc3c5761761e0217021e87f737b4752816f3e5b1b525a3806b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Flogger \
perl-String-Flogger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--MaybeXS \
perl-Params--Util \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
