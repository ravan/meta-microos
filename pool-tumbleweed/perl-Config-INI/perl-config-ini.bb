SUMMARY = "Simple .ini-file format"
DESCRIPTION = "simple .ini-file format"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.029"

RPM_NAME = "perl-Config-INI-0.029-1.17.noarch.rpm"
RPM_HASH = "2e930c07ff30c7fc94ba45bd1ec261cf19f6e85b33ed8d74fd08f644c2f933ed8e036510cea3c077e93b54d02c8dee3b8fe89847d0c44fb1eef733c658919f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI \
perl-Config--INI--Reader \
perl-Config--INI--Writer \
perl-Config-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers"

inherit rpm
