SUMMARY = "Shared data for eiskaltdcpp"
DESCRIPTION = "This package contains shared data for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-2.4.2-6.2.noarch.rpm"
RPM_HASH = "6efd7099702d3559fd80f7b95753d13d077b7725e94ca885ee1b5d194e06ab8aa22a54964c1d7a2a235b05bc9931e9e972aab65f5aaddfd06d2dc3b361bf0999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common"

RDEPENDS:${PN} += "libeiskaltdcpp2-4"

inherit rpm
