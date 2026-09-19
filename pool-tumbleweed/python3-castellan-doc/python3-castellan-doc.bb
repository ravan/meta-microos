SUMMARY = "Documentation for castellan"
DESCRIPTION = "Castellan is a generic Key Manager interface for OpenStack. \
This package contains the documentation"
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python3-castellan-doc-5.8.0-1.1.noarch.rpm"
RPM_HASH = "6566dc0f88e7e2a9acdb110e1fd485dcea051451763f404a7a345c72ef0d533df8ed0b7fb41086fef29d17af8d6e27f4a25046ec66033a6735e69c38e1ab2d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-castellan-doc"

RDEPENDS:${PN} += ""

inherit rpm
