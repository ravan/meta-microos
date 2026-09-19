SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0"

PV = "0.6.6"

RPM_NAME = "python314-zypp-plugin-0.6.6-1.4.noarch.rpm"
RPM_HASH = "8393c2098242e5187825062ca74ad7662231e7bc83b8d9af0fc3e6884ad16157fff58908553a0510782d698618cadc3d072dc648104d00bde73420ab3cad23b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-zypp-plugin"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
