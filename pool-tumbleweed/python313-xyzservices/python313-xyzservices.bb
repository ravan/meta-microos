SUMMARY = "Source of XYZ tiles providers"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static."
LICENSE = "BSD-3-Clause"

PV = "2026.9.1"

RPM_NAME = "python313-xyzservices-2026.9.1-1.1.noarch.rpm"
RPM_HASH = "962178d9c62988316375e3bcf3448dc0cd9944599d49e5c35dc5233d43b0f51feb3934c5c21109e5a99f9727d2b26da4162e94be10883e904d33590e1dafc3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xyzservices \
python3.13dist-xyzservices \
python313-xyzservices \
python3dist-xyzservices"

RDEPENDS:${PN} += "python-abi \
xyzservices-data"

inherit rpm
