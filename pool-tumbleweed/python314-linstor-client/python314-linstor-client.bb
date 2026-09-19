SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python314-linstor-client-1.12.0-3.2.noarch.rpm"
RPM_HASH = "3427136c2107c55cc9553e06afe4a5d791cb11fb5f3d2ec0f64e7902d453769c0b277e4237b01d553f11e2401e1e77ef51b102ded9bcf836aa0fb0c60861f42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-linstor-client \
python314-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python314-linstor"

inherit rpm
