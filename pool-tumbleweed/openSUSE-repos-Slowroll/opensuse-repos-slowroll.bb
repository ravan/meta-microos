SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Slowroll-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "cc068383f3833284c42b05ebd2e5818dc28e84c7221e31793b00a6f8069c7f202f06314a37e50b3cb8795b921e9f5aeebc7fa81ac7ae780f2935f0627a70c627"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Slowroll"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
