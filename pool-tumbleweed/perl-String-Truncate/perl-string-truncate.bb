SUMMARY = "Module for when strings are too long to be displayed in.."
DESCRIPTION = "a module for when strings are too long to be displayed in..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100603"

RPM_NAME = "perl-String-Truncate-1.100603-1.18.noarch.rpm"
RPM_HASH = "2239d7e63162bd2006b55719c0b20ef2206cff002b38b0f6d0a321e82efb31261c033953655c7741e5d8a216d02226081ec1a475fd512ded908c4b1624471b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Truncate \
perl-String-Truncate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install"

inherit rpm
