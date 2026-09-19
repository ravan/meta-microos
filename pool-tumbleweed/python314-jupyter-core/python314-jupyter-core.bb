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

RPM_NAME = "python314-jupyter-core-5.9.1-1.4.noarch.rpm"
RPM_HASH = "916ed580e978455df99eb3549cff85b4ae5d8d118c1139b062dd97eaaeb956e46e90ed43fc672b3914436ff62267f61f130f7ea69eadd0b68febffd139693979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-core \
python314-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-platformdirs \
python314-traitlets"

inherit rpm
