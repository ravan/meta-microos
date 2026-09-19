SUMMARY = "Parallel SSH to control large numbers of Machines simultaneously"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "pssh-2.3.4+git10.d4909c9-5.3.noarch.rpm"
RPM_HASH = "2ec66532a8601aebcdd319b905c5904951defeea185dc3e0b9386e2098264956ffe5fed0e2283ab48b19fb716cbf8fb42b951c2d9383d8f59e18bb5c8054e16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pssh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-pssh"

inherit rpm
