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

RPM_NAME = "python313-pyramid-debugtoolbar-4.12.1-3.5.noarch.rpm"
RPM_HASH = "242679936da85c8c89f1827544403f97a2f1787ca00640437de5416bb52de1a2d1ec35f5b517dad221b967aea8b9f8e00f9ea917baca2794bb3a8b2ab0a3627e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-debugtoolbar \
python3.13dist-pyramid-debugtoolbar \
python313-pyramid-debugtoolbar \
python3dist-pyramid-debugtoolbar"

RDEPENDS:${PN} += "python-abi \
python313-Pygments \
python313-pyramid \
python313-pyramid-mako"

inherit rpm
