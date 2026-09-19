SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.4.2"

RPM_NAME = "python313-yt-4.4.2-1.12.aarch64.rpm"
RPM_HASH = "f5362a828dfe9b07d6953a5c3c804f289bfde150e51153ca49f35f055635c886b921486d2aff84e25034e65f148dae9be9c2937f13d483984fbe2b1b10c083a4"

RPROVIDES:${PN} += "python3-yt \
python3.13dist-yt \
python313-yt \
python3dist-yt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-Pillow \
python313-cmyt \
python313-ewah-bool-utils \
python313-ipywidgets \
python313-matplotlib \
python313-more-itertools \
python313-numpy \
python313-packaging \
python313-tomli-w \
python313-tqdm \
python313-unyt \
update-alternatives"

inherit rpm
