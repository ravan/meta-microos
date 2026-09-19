SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-only"

PV = "0.7.4"

RPM_NAME = "python314-linux-procfs-0.7.4-1.2.noarch.rpm"
RPM_HASH = "634449f364d30dd32366498535127c1d5d907d8d8f5767dd149193787608e4f1e8dc78282e40ccfe977933850802db02829fe6ddf96a3c7ab4b6848b8640c6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-linux-procfs \
python314-linux-procfs \
python3dist-python-linux-procfs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-six"

inherit rpm
