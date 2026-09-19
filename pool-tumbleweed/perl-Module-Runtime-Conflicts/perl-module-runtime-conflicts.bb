SUMMARY = "Provide information on conflicts for Module::Runtime"
DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had a \
recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and 'moose-outdated'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Module-Runtime-Conflicts-0.003-1.38.noarch.rpm"
RPM_HASH = "2a9bb97aac1d88030fd2412b6162a31e6f8ae585b4f46240a6f0015ed37b12f0a735bc77c30ba54bbd562c43f64b8ed739b4263ef2dcd54926f39607d7fffb2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Runtime--Conflicts \
perl-Module-Runtime-Conflicts"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Dist--CheckConflicts \
perl-Module--Runtime"

inherit rpm
