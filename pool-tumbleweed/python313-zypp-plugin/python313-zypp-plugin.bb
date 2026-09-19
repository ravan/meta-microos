SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0"

PV = "0.6.6"

RPM_NAME = "python313-zypp-plugin-0.6.6-1.4.noarch.rpm"
RPM_HASH = "559f6ff21a99f5adc09f536f04011e380b9f2cf07f8a3fb508f945ace6393b91540bcda9acbe63269ece1b5111d66858df2c2f36c753200ddd265c924f2b016b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zypp-plugin \
python313-zypp-plugin"

RDEPENDS:${PN} += "python-abi \
python313-base"

inherit rpm
