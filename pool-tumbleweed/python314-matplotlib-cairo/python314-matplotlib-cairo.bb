SUMMARY = "Cairo backend for python314-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-cairo-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "ab7fec825cf05598ff3e730c4e7bcb9481233ae9d822e0b7b4b6067fccb1017787f67b16e5b793ff9635071546ed812119e6472e084fd136b29cea361bfc3928"

RPROVIDES:${PN} += "python314-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib"

inherit rpm
