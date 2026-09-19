SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-only"

PV = "0.7.4"

RPM_NAME = "python313-linux-procfs-0.7.4-1.2.noarch.rpm"
RPM_HASH = "071d3b6e6228e0199d5fb76918027720aae17ea4bc033ccee7860cdf1559a54778e162b76335f8785eb681f1c300399bc9115b7defeebddcd291b639c4551c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linux-procfs \
python3.13dist-python-linux-procfs \
python313-linux-procfs \
python3dist-python-linux-procfs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-six"

inherit rpm
