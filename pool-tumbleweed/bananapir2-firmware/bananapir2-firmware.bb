SUMMARY = "Binary bootloader and firmware files for Banana Pi R2"
DESCRIPTION = "Binary bootloader and firmware files for Banana Pi R2"
LICENSE = "SUSE-Firmware"

PV = "0.0~git20201119.b0a0872"

RPM_NAME = "bananapir2-firmware-0.0~git20201119.b0a0872-2.5.noarch.rpm"
RPM_HASH = "0624b8f844358bcce069fa442e1d3c929642e9274a5842869f64586434a0ebb1906a6bf250ad69bb4356323fc8b8e066acf5aed355e084d918fde5f33bfea546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bananapir2-firmware"

RDEPENDS:${PN} += ""

inherit rpm
