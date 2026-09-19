SUMMARY = "Web backend for python314-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-web-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "45b0cdb157878b6dfbf4de224da669751453e71859e7b3030998c49166bdbc6636969c479d9a1493f22c720160a1ca9086481adb767f4d9bcc583e375f2eeb38"

RPROVIDES:${PN} += "python314-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-tornado"

inherit rpm
