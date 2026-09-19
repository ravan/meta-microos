SUMMARY = "(DEPRECATED) use Moo instead!"
DESCRIPTION = "(DEPRECATED) use Moo instead!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-Any-Moose-0.270.0-1.10.noarch.rpm"
RPM_HASH = "6806f4c1922b421726b793587f13c662a8d532b603048f0ee998e5e0a381bf2de895a24621fd1bc82bb8865e3017522e4c7c797108cc151a0d56c4f2de8c17a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--Moose \
perl-Any-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mouse"

inherit rpm
