SUMMARY = "An interactive HTML debugger for Pyramid application development"
DESCRIPTION = "A package which provides an interactive HTML debugger for Pyramid application \
development. \
 \
Note that pyramid-debugtoolbar is a blatant rip-off of Michael van Tellingen's \
flask-debugtoolbar (which itself was derived from Rob Hudson's \
django-debugtoolbar). It also includes a lightly sanded down version of the \
Werkzeug debugger code by Armin Ronacher and team."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.12.1"

RPM_NAME = "python314-pyramid-debugtoolbar-4.12.1-3.5.noarch.rpm"
RPM_HASH = "b600fccc0e7c631558ee000ab139fd3ee058533831e85ae0200b26abf0a7a5d243e5d804baf4ca61618896f46c8fd92ee92557ab93bd1bb86e537a0d06ca45c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyramid-debugtoolbar \
python314-pyramid-debugtoolbar \
python3dist-pyramid-debugtoolbar"

RDEPENDS:${PN} += "python-abi \
python314-Pygments \
python314-pyramid \
python314-pyramid-mako"

inherit rpm
