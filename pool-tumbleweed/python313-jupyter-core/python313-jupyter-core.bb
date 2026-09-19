SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.9.1"

RPM_NAME = "python313-jupyter-core-5.9.1-1.4.noarch.rpm"
RPM_HASH = "da7c9d414f7cc29326f5eef8a54d00e85d5b590134c66c7559de4b11fefbf43f6fca38de1d3a13a5b005be6fcd37df4368d377b84f808128d80e8270b6c26a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-core \
python3-jupyter-core \
python3.13dist-jupyter-core \
python313-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-platformdirs \
python313-traitlets"

inherit rpm
