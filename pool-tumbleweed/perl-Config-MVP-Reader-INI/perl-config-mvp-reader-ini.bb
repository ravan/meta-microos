SUMMARY = "An MVP config reader for .ini files"
DESCRIPTION = "Config::MVP::Reader::INI reads _.ini_ files containing MVP-style \
configuration."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.101465"

RPM_NAME = "perl-Config-MVP-Reader-INI-2.101465-1.18.noarch.rpm"
RPM_HASH = "c3818537b3d6f7e82df3a289b031882837d09009f1a3baa48dfe447302cf6b6a4b358230471efe04a6ff78db2d5b66d041c131bf77511c97c76766bb9ceebf9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MVP--Reader--INI \
perl-Config-MVP-Reader-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--INI--Reader \
perl-Config--MVP \
perl-Config--MVP--Reader \
perl-Config--MVP--Reader--Findable--ByExtension \
perl-Moose \
perl-parent"

inherit rpm
