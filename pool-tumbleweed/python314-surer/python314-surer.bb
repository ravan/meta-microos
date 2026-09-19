SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python314-surer-0.0.3-3.4.noarch.rpm"
RPM_HASH = "9594f0844f8b45a6950fec0836b2ca684e854df48128e502650ad71c6ad69b463dc283f1932b93c80d06aaf3e3ed2c8e6f6a7636ae24f9258e624ac314a3db1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-surer \
python314-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
