SUMMARY = ".ini-file parser that returns sections in order"
DESCRIPTION = "Config::INI::Reader::Ordered is a subclass of Config::INI::Reader which \
preserves section order. See Config::INI::Reader for all documentation; the \
only difference is as presented in the SYNOPSIS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.022"

RPM_NAME = "perl-Config-INI-Reader-Ordered-0.022-1.18.noarch.rpm"
RPM_HASH = "144c3d2fa1cd952c53f65a11dce06f86e979a09b11011ba38ffcebba36ce477f1b9dc8804f3700feb3dec1f7cb37fb3832c93c2c49bc076db57cd57426b7b29d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI--Reader--Ordered \
perl-Config-INI-Reader-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--INI--Reader"

inherit rpm
