SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Tumbleweed-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "071bc298e8d3ab46570beb9a35c38d67ba0ac98991862f45bc03d8f36f3675e8069aa2419568447d4a4613d4b33fbc60ad73d7acb287eb4f0c09e4cab9aabffd"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Tumbleweed"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
