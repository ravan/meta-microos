SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python3-webruntime-0.5.4-1.2.noarch.rpm"
RPM_HASH = "8003526b3a94b49c80a704b99418eb4944cabf16fc159b3cd282019006702c73804539d69aad05495c96c9c464abc9da7bbfaf929d37c8ca156dd64534dcb116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dialite"

inherit rpm
