SUMMARY = "Disk I/O Benchmark"
DESCRIPTION = "Benchmark script to measure disk I/O performance."
LICENSE = "ISC"

PV = "0.0+git.20200324"

RPM_NAME = "iops-0.0+git.20200324-1.15.noarch.rpm"
RPM_HASH = "5b572075868ca8b96354bf1a2f50ab17195d3fdab9b67bbfe34bc5dd2dc26c291ea4dfeac8aca338a7703cdc2b5ffd76c058ab66d1219a08da3cd054fbac3f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iops"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
