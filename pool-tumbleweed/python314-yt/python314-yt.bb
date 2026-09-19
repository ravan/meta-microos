SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.4.2"

RPM_NAME = "python314-yt-4.4.2-1.12.aarch64.rpm"
RPM_HASH = "dc7ea5d1e4254e42c48013205a8ed7d8b62aa5b143d3accdc446fe41fc296bb38609b409c0f0384873427a23aee0bc188af539874d781fad3326de2090799000"

RPROVIDES:${PN} += "python3.14dist-yt \
python314-yt \
python3dist-yt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-Pillow \
python314-cmyt \
python314-ewah-bool-utils \
python314-ipywidgets \
python314-matplotlib \
python314-more-itertools \
python314-numpy \
python314-packaging \
python314-tomli-w \
python314-tqdm \
python314-unyt \
update-alternatives"

inherit rpm
