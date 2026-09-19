SUMMARY = "A Simple and Comprehensive Vulnerability Scanner for Containers"
DESCRIPTION = "cAdvisor (Container Advisor) provides container users an understanding of the \
resource usage and performance characteristics of their running containers. It \
is a running daemon that collects, aggregates, processes, and exports \
information about running containers. Specifically, for each container it keeps \
resource isolation parameters, historical resource usage, histograms of \
complete historical resource usage and network statistics. This data is \
exported by container and machine-wide. \
 \
cAdvisor has native support for Docker containers and should support just about \
any other container type out of the box. We strive for support across the board \
so feel free to open an issue if that is not the case.  cAdvisor's container \
abstraction is based on lmctfy's so containers are inherently nested \
hierarchically."
LICENSE = "Apache-2.0"

PV = "0.60.5"

RPM_NAME = "cadvisor-0.60.5-3.1.aarch64.rpm"
RPM_HASH = "470b32de8aa19e99d72544101b1af397b2d8fe178fe0021e22c1c2bc4ce59c0f2e22383ee30eabf0b579fd756b7d0f979c2bc491bef1a61569ef94e385c2448e"

RPROVIDES:${PN} += "cadvisor"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ca-certificates \
fillup \
git-core \
libc.so.6 \
rpm"

inherit rpm
