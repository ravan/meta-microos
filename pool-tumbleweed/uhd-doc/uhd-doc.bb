SUMMARY = "Documentation files for uhd"
DESCRIPTION = "This package contains the documentation for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-doc-4.10.0.0-2.1.noarch.rpm"
RPM_HASH = "2903fa626c35a870d5e1d85d9db80cec61ebfff749ed70765255f8fe994a186bb4a2c16824fd1452f08d8cd79ae7a1cab558db71d4e7dd6e1a0ce7ebf79cc8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-doc"

RDEPENDS:${PN} += ""

inherit rpm
