SUMMARY = "NAnt pkgconfig files"
DESCRIPTION = "This package contains the pkgconfig files for NAnt."
LICENSE = "LGPL-2.1"

PV = "0.92+git20130131"

RPM_NAME = "nant-devel-0.92+git20130131-11.6.noarch.rpm"
RPM_HASH = "3942cc8df2e639d2a28b1e51a67fa8cb17ffedd2ccbe74c8884058eb8a327a70222c2dd622a35c34101152d53b32c5dc25028a9f6f6cadb0f312b313c4bf2036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nant-devel \
pkgconfig-nant"

RDEPENDS:${PN} += "nant"

inherit rpm
