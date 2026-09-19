SUMMARY = "Module for reading .ini-style configuration files"
DESCRIPTION = "Config::IniFiles provides a way to have readable configuration files \
outside your Perl script. Configurations can be imported (inherited, \
stacked,...), sections can be grouped, and settings can be accessed from a \
tied hash."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.002000"

RPM_NAME = "perl-Config-IniFiles-3.002000-1.3.noarch.rpm"
RPM_HASH = "8894502e10c22475157af751ae2aa25f7d9e3b91a0e97d77bc3ac8e223c1024cc397c70fa7a15faa402afe8bd26297aa7704598fdace700d07fe09a6d7c49a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--IniFiles \
perl-Config--IniFiles---section \
perl-Config-IniFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Scalar \
perl-List--Util"

inherit rpm
