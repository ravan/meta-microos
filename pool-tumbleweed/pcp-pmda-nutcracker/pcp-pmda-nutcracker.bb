SUMMARY = "Performance Co-Pilot (PCP) metrics for NutCracker (TwemCache)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from NutCracker (TwemCache)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-nutcracker-6.3.8-3.1.noarch.rpm"
RPM_HASH = "77ffa0bad8a43e2ffebe06039a3b95aab42956ea51d7583da6d1c0104162adac363b0cc05ed29717efb7a6a6bc679d1962aefac9a7b4dd1bc3393fa1a403ddae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-nutcracker \
pcp-pmda-nutcracker"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-JSON \
perl-PCP-PMDA \
perl-YAML--XS"

inherit rpm
