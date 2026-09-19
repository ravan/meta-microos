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

RPM_NAME = "python313-intake-2.0.9-3.1.noarch.rpm"
RPM_HASH = "fe11dd4c1ba3ca5373df3b1d9fffb3764a32a367cbe956945dfffa42e7f1e4194c62bcec4fbc7d3368ae57dea89fd08fb8d9ec7213330fa3c9f02269097a863b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intake \
python3.13dist-intake \
python313-intake \
python3dist-intake"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-fsspec \
python313-networkx \
python313-platformdirs"

inherit rpm
