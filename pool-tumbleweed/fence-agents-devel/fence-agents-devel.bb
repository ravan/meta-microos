SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides agents suitable only for \
development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-devel-4.17.0+git.1786356985.d90bec5f-1.1.aarch64.rpm"
RPM_HASH = "6b36b63254bfe7f110c6594bfc2a630fbbca5cdcbb250e0541240202b3d11ca7c06fbacc3c66f748e749dd46822ce4efcd84f184164036087d312cd2fb631a27"

RPROVIDES:${PN} += "fence-agents-devel \
pkgconfig-fence-agents"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
