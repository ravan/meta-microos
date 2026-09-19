SUMMARY = "A framework for defining long-running services"
DESCRIPTION = "Cotyledon provides a framework for defining long-running services."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python314-cotyledon-2.2.0-1.3.noarch.rpm"
RPM_HASH = "5e8e4799cebc3502b56881098a0033fbe0f0eb1885216ed82f3975452388797078ebf46ff3de839159293fcef679de9cd46a31d93426a170a3706ae50105e86d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cotyledon \
python314-cotyledon \
python3dist-cotyledon"

RDEPENDS:${PN} += "python-abi \
python314-setproctitle"

inherit rpm
