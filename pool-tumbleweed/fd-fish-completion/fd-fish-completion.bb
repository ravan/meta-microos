SUMMARY = "Fish Completion for fd"
DESCRIPTION = "The official fish completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "10.4.2"

RPM_NAME = "fd-fish-completion-10.4.2-1.5.noarch.rpm"
RPM_HASH = "d360875196be02e99e37b0327a10ae5fc2253b090b60f29c3e8fe5648d6b817188a26364d32b86e8ff5f41a0126df231545397c2c3651b936b5cf3abec930a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
