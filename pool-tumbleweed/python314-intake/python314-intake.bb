SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A python package for describing, loading and processing data \
 \
Intake is an open-source package to: \
 * describe your data declaratively \
 * gather data sets into catalogs \
 * search catalogs and services to find the right data you need \
 * load, transform and output data in many formats \
 * work with third party remote storage and compute platforms"
LICENSE = "BSD-2-Clause"

PV = "2.0.9"

RPM_NAME = "python314-intake-2.0.9-3.1.noarch.rpm"
RPM_HASH = "f91c6f7879b989c5465d1b971ea5dfdbb1a65995598e95a851c03f1af6e898754c161f86229dd8fd5a63bd43e56e5ca439ed0c8d5d939f99b3a327802a93c59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-intake \
python314-intake \
python3dist-intake"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-fsspec \
python314-networkx \
python314-platformdirs"

inherit rpm
