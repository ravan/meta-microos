SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python313-hvplot-0.12.2-2.3.noarch.rpm"
RPM_HASH = "d8e5bcf3023e829b1d7b5786d611c67e301a45c9f321f468f145f55f228dca46dabff64f404b6de1f39ef916d4d169fe8144e2b24b35780b7c1efb87870158ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvplot \
python3.13dist-hvplot \
python313-hvplot \
python3dist-hvplot"

RDEPENDS:${PN} += "-python313-param >= 1.12 with python313-param < 3 \
python-abi \
python313-bokeh \
python313-colorcet \
python313-holoviews \
python313-numpy \
python313-packaging \
python313-pandas \
python313-panel \
update-alternatives"

inherit rpm
