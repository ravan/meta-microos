SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python314-webruntime-0.5.8-2.5.noarch.rpm"
RPM_HASH = "22a75f782a9ae01204beb247d805be7b77de8152780233ba22690492a62e22338352f771d356e6af358b75fa371e8ba6673c3bee6640d041c4ab014ff0665d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webruntime \
python314-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-dialite \
update-alternatives"

inherit rpm
