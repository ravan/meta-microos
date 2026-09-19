SUMMARY = "Docker Bench for Security"
DESCRIPTION = "The Docker Bench for Security is a script that checks for dozens of common \
best-practices around deploying Docker containers in production. \
 \
The tests are all automated, and implement the CIS Docker Benchmark."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "docker-bench-security-1.6.1-1.6.noarch.rpm"
RPM_HASH = "4f759f933e1e9d6ce0a77a7f8c84c93b27f5042ee4e856db146ea2e801dc379bf82a00becc325298fd3eb9cd794471d92ff514efa5ae8fbe47bb6d13216b06f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bench-security"

RDEPENDS:${PN} += "/usr/bin/bash \
audit \
coreutils \
docker \
findutils \
gawk \
grep \
net-tools \
net-tools-deprecated \
sed"

inherit rpm
