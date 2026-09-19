SUMMARY = "ALSA topology configurations"
DESCRIPTION = "This package contains the configuration files for ALSA topology support."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.1"

RPM_NAME = "alsa-topology-conf-1.2.5.1-1.14.noarch.rpm"
RPM_HASH = "4522447d89dfa04b1486b46083e4d60ae931cc7aef2ddabd974d79d04b75a003f99f91d92abf0c471797d789139e05dfd970993dba49999ad13f8b384710036a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-topology-conf \
firmware-skl-hda-dsp-generic-tplg.bin"

RDEPENDS:${PN} += ""

inherit rpm
