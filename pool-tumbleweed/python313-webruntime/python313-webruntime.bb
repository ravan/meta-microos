SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python313-webruntime-0.5.8-2.5.noarch.rpm"
RPM_HASH = "b1e2edface6484b8116b545b30ca3c0ac5426b4227aa306036eb9feb93c1cb38e72a3bdfa98e754cdf813044e8743a6fbb55538714a1b7b870ebe25c4c9cba08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webruntime \
python3.13dist-webruntime \
python313-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-dialite \
update-alternatives"

inherit rpm
