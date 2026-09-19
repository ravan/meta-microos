SUMMARY = "Magical config file parser"
DESCRIPTION = "This module was written after having to write Yet Another Config File \
Parser for some variety of colon-separated config. I decided 'never again'. \
 \
Config::Auto aims to be the most 'DWIM' config parser available, by \
detecting configuration styles, include paths and even config filenames \
automagically. \
 \
See the the HOW IT WORKS manpage section below on implementation details."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.44"

RPM_NAME = "perl-Config-Auto-0.44-3.42.noarch.rpm"
RPM_HASH = "57665e2a4cce7703e504818e2bb04864a01a7733e31a80bf3db944da08e5f20aa667bbc0c9f284e5cbe1c32cd84c2d712d055c56ccce9cf02296b63951388fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Auto \
perl-Config-Auto"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--IniFiles \
perl-IO--String \
perl-YAML"

inherit rpm
