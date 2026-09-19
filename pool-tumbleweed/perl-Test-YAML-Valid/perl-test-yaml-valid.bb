SUMMARY = "Test for valid YAML"
DESCRIPTION = "Test for valid YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Test-YAML-Valid-0.04-10.37.noarch.rpm"
RPM_HASH = "96313485909f79ef60bcbab57195001206f7874e27df783d677d9868fa1a61d4d17ddd9500a2960efc0c612a029584b97a3dbfa3ec958ead34d3752ddda1887b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML--Valid \
perl-Test-YAML-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-YAML"

inherit rpm
