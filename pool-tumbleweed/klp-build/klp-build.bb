SUMMARY = "The kernel livepatching creation tool"
DESCRIPTION = "The kernel livepatching creation tool."
LICENSE = "GPL-2.0-only"

PV = "1.1.0~20250507.8576150"

RPM_NAME = "klp-build-1.1.0~20250507.8576150-2.4.noarch.rpm"
RPM_HASH = "02a37deb141edfa55dd0a58ede36f79ef313d00143ae2c0c8670b8755c60e95072427e45d3c0ff8525434f4749975848958e160811fe3762aecc518e78be1581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klp-build \
python3.13dist-klp-build \
python3dist-klp-build"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-GitPython \
python3-Mako \
python3-MarkupSafe \
python3-bugzilla \
python3-cached-property \
python3-filelock \
python3-lxml \
python3-natsort \
python3-osc-tiny \
python3-pyelftools \
python3-requests \
python3-zstandard"

inherit rpm
