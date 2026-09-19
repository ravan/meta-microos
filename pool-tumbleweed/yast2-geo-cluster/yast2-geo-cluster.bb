SUMMARY = "Configuration of booth"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-geo-cluster-5.0.1-1.2.noarch.rpm"
RPM_HASH = "4f7e782b1acf9c0caf5632c1ad2edf801e6d58145073530757462887f430e1a4a9a80eddbb0e14ea69307d8331361a2fd1f0d3bc770a52f4747ece64a421fc8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GeoCluster \
yast2-geo-cluster"

RDEPENDS:${PN} += "/usr/bin/python3 \
autoyast2-installation \
yast2 \
yast2-ruby-bindings"

inherit rpm
